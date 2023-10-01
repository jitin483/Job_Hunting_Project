package com.mvc.services;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.collections4.map.LRUMap;
import com.mvc.dao.CacheInterface;


/**
 * @author JitinKumar
 *
 * @param <K>
 * @param <V>
 */
public class StoredData<K, V> implements CacheInterface<K, V> {

    public static final Long DEFAULT_CACHE_TIMEOUT = 60000L;//1 minute
    protected LRUMap<K, CacheValue<V>> cacheMap;
    protected Long cacheTimeout;

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public StoredData() {
        this(DEFAULT_CACHE_TIMEOUT);
    }

    /**
     * @param cacheTimeout
     */
    public StoredData(Long cacheTimeout) {
        this.cacheTimeout = cacheTimeout;
        this.clear();
    }

    /**
     *This is for expired keys
     */
    @Override
    public void clean() {
        for(K key: this.getExpiredKeys()) {
            this.remove(key);
        }
    }

    /**
     * for find the key 
     * @param k key
     */
    @Override
    public boolean containsKey(K key) {
        return this.cacheMap.containsKey(key);
    }

    /**
     * @return
     */
    protected Set<K> getExpiredKeys() {
        return this.cacheMap.keySet().parallelStream()
                .filter(this::isExpired)
                .collect(Collectors.toSet());
    }

    protected boolean isExpired(K key) {
        LocalDateTime expirationDateTime = this.cacheMap.get(key).getCreatedAt().plus(this.cacheTimeout, ChronoUnit.MILLIS);
        return LocalDateTime.now().isAfter(expirationDateTime);
    }

    @Override
    public void clear() {
        this.cacheMap = new LRUMap<>(3);//it is for how many values stored in cache
    }

    @Override
    public Optional<V> get(K key) {
        this.clean();
        cacheMap.entrySet().stream().forEach(e->System.out.println(e));
        return Optional.ofNullable(this.cacheMap.get(key)).map(CacheValue::getValue);
    }

    @Override
    public void put(K key, V value) {
   
        this.cacheMap.put(key, this.createCacheValue(value));
    }

    /**
     * @param value
     * @return
     */
    protected CacheValue<V> createCacheValue(V value) {
        LocalDateTime now = LocalDateTime.now();
        return new CacheValue<V>() {
            @Override
            public V getValue() {
                return value;
            }

            @Override
            public LocalDateTime getCreatedAt() {
                return now;
            }
        };
    }

    @Override
    public void remove(K key) {
        this.cacheMap.remove(key);
    }

    /**
     *
     * @param <V>
     */
    protected interface CacheValue<V> {
        V getValue();

        LocalDateTime getCreatedAt();
    }

	@Override
	public String toString() {
		cacheMap.forEach((k,v)->System.out.println(k +" "+v));
		return null;
	}
    

}
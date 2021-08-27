package org.overrun.commonutils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author squid233
 * @since 0.2.0
 */
public class MapStr2Obj<V> extends HashMap<String, V> {
    /**
     * construct
     *
     * @param initialCapacity initialCapacity
     * @param loadFactor      loadFactor
     */
    public MapStr2Obj(int initialCapacity,
                      float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    /**
     * construct
     *
     * @param initialCapacity initialCapacity
     */
    public MapStr2Obj(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * construct
     */
    public MapStr2Obj() {
    }

    /**
     * construct
     *
     * @param m the other map to copy
     */
    public MapStr2Obj(Map<? extends String, ? extends V> m) {
        super(m);
    }
}

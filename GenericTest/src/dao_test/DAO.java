package dao_test;

import java.util.*;

/**
 * @Auther: Carl
 * @Date: 2021/02/14/15:40
 * @Description:
 */
public class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public DAO() {
    }

    public DAO(Map<String, T> map) {
        this.map = map;
    }

    //保存T类型的对象到 Map成员变量中
    public void save(String id, T entity){
        map.put(id, entity);
    }

    //从 map中获取id对应的对象
    public T get(String id)   {
        return map.get(id);
    }

    //替换 map中key为 id 的内容,改为 entity 对象
    public void update(String id,T entity) {
        map.replace(id, entity);
    }

    //返回 map 中存放的所有 T 对象
    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<Map.Entry<String, T>> set = map.entrySet();
        Iterator<Map.Entry<String, T>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, T> map = iterator.next();
            T value = map.getValue();
            list.add(value);
        }
        return list;
    }

    //删除指定 id 对象
    public void delete(String id)  {
        map.remove(id);
    }
}

package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemRepository {

    private static final Map<Long, Item> store = new HashMap<>();
    private static long sequence = 0L;

    public Item save(Item item){
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(long id){
        return store.get(id);
    }

    public List<Item> findAll(){
        /*
        store.values()로 반환해도 값은 동일하나,
        감싸서 반환하게 된다면 List 에 값을 추가해도 원본 저장소에는 영향이 가지 않는다.
         */
        return new ArrayList<>(store.values());
    }

    public void updateItem(Long itemId, Item updateParam){
        Item findItem = findById(itemId);
        /*
        ID가 쓰이지 않으므로 원래는 사용할 파라미터만 담을 DTO 를 통하는게 맞다.
        강의에서는 프로젝트 볼륨이 작으므로 편의상 객체 그대로 사용
         */
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
        store.put(itemId, findItem);
    }

    // For Test
    public void clearStore(){
        store.clear();
    }

}

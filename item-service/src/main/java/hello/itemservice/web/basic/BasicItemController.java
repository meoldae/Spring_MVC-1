package hello.itemservice.web.basic;

import hello.itemservice.domain.item.Item;
import hello.itemservice.domain.item.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
@RequestMapping("basic/items")
@RequiredArgsConstructor
public class BasicItemController {

    // @RequiredArgsConstructor 덕에 생성자에서 주입해 줄 필요가 없다! ( final 필드에 한해 )
    private final ItemRepository itemRepository;

    @GetMapping
    public String items(Model model){
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "basic/items";
    }

    @GetMapping("/{itemId}")
    public String item(@PathVariable long itemId, Model model){
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "basic/item";
    }

    @GetMapping("/add")
    public String addForm(){
        return "basic/addForm";
    }

    // @PostMapping("/add")
    public String addItemV1(@RequestParam String itemName, @RequestParam Integer price, @RequestParam Integer quantity, Model model){
        Item item = new Item(itemName, price, quantity);
        itemRepository.save(item);
        model.addAttribute("item", item);
        return "basic/item";
    }

    // @PostMapping("/add")
    public String addItemV2(@ModelAttribute("item") Item item){
        itemRepository.save(item);

        /*
        * model.addAttribute("item", item);
        * @ModelAttribute("name") 은 model 에 동일한 이름(Key)으로 받은 데이터를 넣어준다.
        * 때문에 윗 문장이 주석처리되어도 되는 것! + 파라미터로 모델 받을 필요도 없음!
        */
        return "basic/item";
    }

    // @PostMapping("/add")
    public String addItemV3(@ModelAttribute Item item){
        itemRepository.save(item);
        // Name 속성을 넣지 않으면 Class 의 맨 첫글자를 소문자로 바꾸어 ModelAttribute 에 담긴다.
        return "basic/item";
    }

    // @PostMapping("/add")
    public String addItemV4(Item item){
        // 기본형이나 String 이 아닌 객체가 오면 ModelAttribute 를 생략해도 된다!
        itemRepository.save(item);
         return "basic/item";
    }

    @PostMapping("/add")
    public String addItemV5(Item item){
        // 기본형이나 String 이 아닌 객체가 오면 ModelAttribute 를 생략해도 된다!
        itemRepository.save(item);
        return "redirect:/basic/items/" + item.getId();
    }

    @GetMapping("/{itemId}/edit")
    public String editForm(@PathVariable Long itemId, Model model){
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "basic/editForm";
    }

    @PostMapping("/{itemId}/edit")
    public String edit(@PathVariable Long itemId, @ModelAttribute Item item){
        itemRepository.updateItem(itemId, item);
        return "redirect:/basic/items/{itemId}";
    }

    @PostConstruct
    public void init(){
        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));
    }
}

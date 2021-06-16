package gefuxing.conreoller;

import gefuxing.domain.CommonResult;
import gefuxing.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;

    @GetMapping("/storage")
    public CommonResult changeStorage(

            @RequestParam("productId") Long productId,
            @RequestParam("count") Integer  count
    ) {
        return  storageService.changeStorage(productId, count);
    }
}

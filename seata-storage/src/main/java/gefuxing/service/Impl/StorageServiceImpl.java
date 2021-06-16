package gefuxing.service.Impl;

import gefuxing.domain.CommonResult;
import gefuxing.mapper.StorageMapper;
import gefuxing.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;


    @Override
    public CommonResult changeStorage(Long productId, Integer count) {

        storageMapper.changeStorage(productId,count);
        return new CommonResult(200, "ok");
    }
}

package gefuxing.mapper;


import gefuxing.domain.CommonResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author gefuxing
 * @create 2021/6/14 13:02
 */
@Mapper
public interface StorageMapper {


    void changeStorage(@Param("productId") Long productId, @Param("count")Integer count);
}

package top.zywork.common;

import org.junit.Test;
import top.zywork.enums.RandomCodeEnum;

/**
 * 随机验证码工具测试类<br />
 * 创建于2017-08-24
 *
 * @author Wang Zhenyu
 */
public class RandomUtilsTest {

    @Test
    public void testRandomNum() {
        System.out.println(RandomUtils.randomNum(100000, 999999));
    }

    @Test
    public void testRandomCode() {
        System.out.println(RandomUtils.randomCode(RandomCodeEnum.MIX_CODE, 5));
    }
}
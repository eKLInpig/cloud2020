package com.pig.springcloud.service.impl;

import com.pig.springcloud.dao.AccountDao;
import com.pig.springcloud.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author eklin
 * @create 2020-03-09 13:41
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountDao accountDao;

    // 扣减账户余额
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("--->storage-service中扣减账户余额开始");
        // 模拟超时异常，全局事务回滚
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountDao.decrease(userId,money);
        LOGGER.info("--->storage-service中扣减账户余额结束");
    }
}

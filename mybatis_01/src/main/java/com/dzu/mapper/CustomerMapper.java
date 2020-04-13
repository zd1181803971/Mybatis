package com.dzu.mapper;

import com.dzu.pojo.Customer;

public interface CustomerMapper {
    Customer selectById(int id);

    int insertUser(Customer customer);
}

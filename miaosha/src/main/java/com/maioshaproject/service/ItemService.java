package com.maioshaproject.service;

import com.maioshaproject.error.BusinessException;
import com.maioshaproject.service.model.ItemModel;

import java.util.List;


public interface ItemService {

    //创建商品
    ItemModel createItems(ItemModel itemModel) throws BusinessException;
    //商品列表浏览
    List<ItemModel> listItem();

    //商品详情浏览
    ItemModel getItemById(Integer id);

    //库存扣减
    boolean decreaseStock(Integer itemId, Integer amount)throws BusinessException;

    //商品销量增加
    void increaseSales(Integer itemId, Integer amount)throws BusinessException;

}

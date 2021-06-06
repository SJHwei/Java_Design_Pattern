package com.atguigu.responsibilitychain;

/**
 * @author ShiWei
 * @date 2021/6/6 - 10:04
 */
public class ViceShoolMasterApprover extends Approver {

    public ViceShoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 10000 && purchaseRequest.getPrice() <= 30000) {
            System.out.println("请求编号id=" + purchaseRequest.getId() + "被" + this.name + "处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}

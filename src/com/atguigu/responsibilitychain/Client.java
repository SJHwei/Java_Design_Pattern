package com.atguigu.responsibilitychain;

/**
 * @author ShiWei
 * @date 2021/6/6 - 10:06
 */
public class Client {

    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceShoolMasterApprover viceShoolMasterApprover = new ViceShoolMasterApprover("王副校长");
        ShoolMasterApprover shoolMasterApprover = new ShoolMasterApprover("佟校长");

        //需要将各个审批级别的下一个设置好（处理人构成环形）
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceShoolMasterApprover);
        viceShoolMasterApprover.setApprover(shoolMasterApprover);
        shoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
        viceShoolMasterApprover.processRequest(purchaseRequest);

    }
}

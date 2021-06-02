package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ShiWei
 * @date 2021/6/1 - 15:19
 */
public class Client {

    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<College>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);
        Output output = new Output(collegeList);
        output.printCollege();
    }
}

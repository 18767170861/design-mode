package org.wmc.behavior.state.score;

/**
 * 客户类
 */
public class ScoreStateMain {

    /**
     * 学生成绩状态测试：
     * 加上：30分，	当前分数：30分，	当前状态：不及格
     * 加上：40分，	当前分数：70分，	当前状态：中等
     * 加上：25分，	当前分数：95分，	当前状态：优秀
     * 加上：-15分，	当前分数：80分，	当前状态：中等
     * 加上：-25分，	当前分数：55分，	当前状态：不及格
     */
    public static void main(String[] args) {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }

}

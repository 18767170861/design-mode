package org.wmc.create.builder.parlour;

/**
 * 指挥者：项目经理
 */
public class ProjectManager {
    private Decorator builder;
    public ProjectManager(Decorator builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Parlour decorate() {
        builder.buildWall();
        builder.buildTV();
        builder.buildSofa();
        return builder.getResult();
    }
}

/**
 * 用模板方法模式实现出国留学手续设计程序:
 *   分析：出国留学手续一般经过以下流程：索取学校资料，提出入学申请，办理因私出国护照、出境卡和公证，申请签证，体检、订机票、准备行装，抵达目标学校等，
 *   其中有些业务对各个学校是一样的，但有些业务因学校不同而不同，所以比较适合用模板方法模式来实现。
 *
 *   在本实例中，我们先定义一个出国留学的抽象类 StudyAbroad，里面包含了一个模板方法 TemplateMethod()，该方法中包含了办理出国留学手续流程中的各个基本方法，
 *   其中有些方法的处理由于各国都一样，所以在抽象类中就可以实现，但有些方法的处理各国是不同的，必须在其具体子类（如美国留学类 StudyInAmerica）中实现。
 *   如果再增加一个国家，只要增加一个子类就可以了，图 study.jpgStudyAbroadProcess  所示是其结构图。
 *
 */
package org.wmc.behavior.template.study;
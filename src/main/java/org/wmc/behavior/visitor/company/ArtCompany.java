package org.wmc.behavior.visitor.company;

/**
 * 具体访问者：艺术公司
 */
public class ArtCompany implements Company {

    public String create(Paper element) {
        return "讲学图";
    }

    public String create(Cuprum element) {
        return "朱熹铜像";
    }
}

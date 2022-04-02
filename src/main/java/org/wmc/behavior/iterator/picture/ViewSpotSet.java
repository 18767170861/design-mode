package org.wmc.behavior.iterator.picture;

/**
 * 抽象聚合：婺源景点集接口
 */
public interface ViewSpotSet {

    void add(WyViewSpot obj);

    void remove(WyViewSpot obj);

    ViewSpotIterator getIterator();
}

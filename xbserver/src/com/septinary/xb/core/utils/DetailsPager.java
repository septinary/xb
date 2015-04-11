package com.septinary.xb.core.utils;

public class DetailsPager<T>
{
  private T currentObj;
  private T preObj;
  private T nextObj;

  public DetailsPager()
  {
  }

  public DetailsPager(T currentObj)
  {
    this.currentObj = currentObj;
  }

  public DetailsPager(T currentObj, T preObj, T nextObj)
  {
    this.currentObj = currentObj;

    this.preObj = preObj;

    this.nextObj = nextObj;
  }

  public T getCurrentObj()
  {
    return this.currentObj;
  }

  public void setCurrentObj(T currentObj) {
    this.currentObj = currentObj;
  }

  public T getPreObj() {
    return this.preObj;
  }

  public void setPreObj(T preObj) {
    this.preObj = preObj;
  }

  public T getNextObj() {
    return this.nextObj;
  }

  public void setNextObj(T nextObj) {
    this.nextObj = nextObj;
  }
}
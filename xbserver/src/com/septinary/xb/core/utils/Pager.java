package com.septinary.xb.core.utils;

import java.util.List;

public class Pager<T>
{
  private List<T> dataList = null;

  private int totalCount = 0;

  private int pageSize = 0;

  private int currentPage = 1;

  private int pageCount = 1;

  public Pager(Integer pageSize, Integer totalCount, Integer currentPage)
  {
    if (pageSize == null)
    {
      pageSize = Integer.valueOf(15);
    }

    setPageSize(pageSize.intValue());

    setTotalCount(totalCount.intValue());

    Double pageNum = Double.valueOf(Math.ceil((getTotalCount() + 0.0D) / pageSize.intValue()));

    if ((currentPage == null) || (currentPage.intValue() < 1) || (totalCount.intValue() == 0))
    {
      setCurrentPage(1);
    }
    else if (currentPage.intValue() > pageNum.intValue())
    {
      setCurrentPage(pageNum.intValue());
    }
    else
    {
      setCurrentPage(currentPage.intValue());
    }

    setPageCount(pageNum.intValue());
  }

  public Pager(int totalCount, int pageSize, int currentPage, List<T> dataList)
  {
    this.dataList = dataList;
    this.pageSize = pageSize;
    this.currentPage = currentPage;
    this.totalCount = totalCount;
  }

  public Pager() {
  }

  public List<T> getDataList() {
    return this.dataList;
  }

  public void setDataList(List<T> dataList) {
    this.dataList = dataList;
  }

  public int getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getCurrentPage() {
    return this.currentPage;
  }

  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }

  public int getPageCount()
  {
    return this.pageCount;
  }

  public int getTotalCount()
  {
    return this.totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }
}

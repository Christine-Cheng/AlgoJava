package com.algo.sparse;

import java.util.List;

public class PageInfo<T> {
	private Integer currentPage ;
	private Integer pageSize ;  //每页显示多少条数
	private Long rowCount  ;
	private Integer pageCount ; //总页
	private Integer startIndex ;
	private Integer prePage ;
	private Integer nextPage ;
	private boolean isFirstPage ;
	private boolean isLastPage ;
	
	private List<T> lists ;
	
	//构造方法的目的 是创建对�? 返回�? 页面
	public PageInfo(List<T> lists,Long rowCount,Integer currentPage,Integer pageSize){
		this.lists = lists ;
		this.currentPage = currentPage;
		this.rowCount = rowCount ;
		this.pageSize = pageSize;
		
		//计算总页
		if(rowCount % this.getPageSize() == 0){
			pageCount = (int) (rowCount / pageSize);
		}else {
			pageCount = (int) (rowCount / pageSize +1);
		}
	}
	
	public Integer getCurrentPage() {
		if(this.currentPage == null || this.currentPage == 0) {
			this.currentPage = 1;
		}
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		//this.pageSize = 4 ;
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getRowCount() {
		return rowCount;
	}

	public void setRowCount(Long rowCount) {
		this.rowCount = rowCount;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getStartIndex() {
		this.startIndex = (this.currentPage - 1) * this.pageSize;
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getPrePage() {
		if(this.currentPage == 1){
			this.prePage = 1 ;
		}else {
			this.prePage = this.currentPage - 1;
		}
		return prePage;
	}

	public void setPrePage(Integer prePage) {
		this.prePage = prePage;
	}

	public Integer getNextPage() {
		if(this.currentPage == this.getPageCount()){
			this.nextPage = this.getPageCount();
		}else {
			this.nextPage = this.currentPage +1;
		}
		
		return nextPage;
	}

	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}

	public boolean isFirstPage() {
		if(this.currentPage == 1) {
			return true ;
		}else {
			return false ;
		}
	}

	public void setFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}

	public boolean isLastPage() {
		if(this.currentPage == this.getPageCount()){
			return true ;
		}else {
			return false ;
		}
	}

	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

	public List<T> getLists() {
		return lists;
	}

	public void setLists(List<T> lists) {
		this.lists = lists;
	}
}

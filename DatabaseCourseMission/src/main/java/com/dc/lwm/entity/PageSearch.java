/**
 * 
 */
package com.dc.lwm.entity;

/**
 * @author 李巍岷
 * @date 2019年6月11日
 *
 * 
 */
public class PageSearch {
	// 当前页码,默认第一页
	private int curentPageNo = 1;
	// 总页数
	private int totalCount;
	// 页面容量
	private int pageSize = 5;
	// 上一页
	private int upPageNo;
	// 下一页
	private int nextPageNo;
	// 要前往的页码,默认0
	private int toPageNo = 0;

	public int getCurentPageNo() {
		return curentPageNo;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getUpPageNo() {
		return upPageNo;
	}

	public void setUpPageNo(int upPageNo) {
		this.upPageNo = upPageNo;
	}

	public int getNextPageNo() {
		return nextPageNo;
	}

	public void setNextPageNo(int nextPageNo) {
		this.nextPageNo = nextPageNo;
	}

	public int getToPageNo() {
		return toPageNo;
	}

	public void setToPageNo(int toPageNo) {
		this.toPageNo = toPageNo;
	}

	@Override
	public String toString() {
		return "PageSearch [curentPageNo=" + curentPageNo + ", totalCount=" + totalCount + ", pageSize=" + pageSize
				+ ", upPageNo=" + upPageNo + ", nextPageNo=" + nextPageNo + ", toPageNo=" + toPageNo + "]";
	}

	public PageSearch() {
		super();
	}

	public void setToPageNo(Integer toPageNo) {
		// 新一页
		this.toPageNo = (toPageNo - 1) * pageSize;
		// 设置跳转后当前的页码
		setCurentPageNo(toPageNo);
	}

	// 设置当前页码
	public void setCurentPageNo(int curentPageNo) {
		if (curentPageNo != 1) {
			this.upPageNo = curentPageNo - 1;
		}
		this.nextPageNo = curentPageNo + 1;

		this.curentPageNo = curentPageNo;
	}

	public void setTotalCount(int totalCount) {
		if (totalCount % pageSize > 0) {
			this.totalCount = (totalCount / pageSize) + 1;
		} else {
			this.totalCount = totalCount / pageSize;
		}

	}
}

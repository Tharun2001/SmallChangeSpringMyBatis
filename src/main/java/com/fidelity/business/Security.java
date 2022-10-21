package com.fidelity.business;

import java.util.Objects;

public class Security {
	
	private int stockId;
	private String stockName; 
	private double stockLtp;
	private String stockCode;
	private String stockAssetClass;
	
	
	public Security() {
		super();
	}

	public Security(int s_id, String s_name, String s_code, double s_ltp, String s_ac) {
		
		if(s_code==null || s_code.length()==0) {
			throw new IllegalArgumentException("Stock Code cannot be empty");
		}
		
		if(s_name==null || s_name.length()==0) {
			throw new IllegalArgumentException("Stock Name cannot be empty");
		}
		
		if(s_ltp<0) {
			throw new IllegalArgumentException("Stock LTP cannot be less than zero");
		}
		
		if(s_id<0) {
			throw new IllegalArgumentException("Stock ID cannot be negative");
		}
		
		this.stockId = s_id;
		this.stockLtp = s_ltp;
		this.stockName = s_name;
		this.stockAssetClass = s_ac;
		this.stockCode = s_code;
	}
	
	public int getStockId() {
		return stockId;
	}
	
	public double getStockLtp() {
		return stockLtp;
	}
	
	public String getStockName() {
		return stockName;
	}
	
	public String getStockAssetClass() {
		return stockAssetClass;
	}
	
	public String getStockCode() {
		return stockCode;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public void setStockLtp(double stockLtp) {
		this.stockLtp = stockLtp;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public void setStockAssetClass(String stockAssetClass) {
		this.stockAssetClass = stockAssetClass;
	}

	@Override
	public int hashCode() {
		return Objects.hash(stockAssetClass, stockCode, stockId, stockLtp, stockName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Security other = (Security) obj;
		return Objects.equals(stockAssetClass, other.stockAssetClass) && Objects.equals(stockCode, other.stockCode)
				&& stockId == other.stockId
				&& Double.doubleToLongBits(stockLtp) == Double.doubleToLongBits(other.stockLtp)
				&& Objects.equals(stockName, other.stockName);
	}

	@Override
	public String toString() {
		return "Security [stockId=" + stockId + ", stockName=" + stockName + ", stockLtp=" + stockLtp + ", stockCode="
				+ stockCode + ", stockAssetClass=" + stockAssetClass + "]";
	}


}

package br.com.analitics.vo.outros;

public class ErrorVO {
	private String error;
	private Integer status;
	
	public ErrorVO() {
	}

	public ErrorVO(String error, Integer status) {
		this.error = error;
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public Integer getStatus() {
		return status;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ErrorVO [error=" + error + ", status=" + status + "]";
	}
}

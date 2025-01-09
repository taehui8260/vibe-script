package com.taehui.vibescribe.common.response;

public class ApiResponse<T> {
    private int status;       // HTTP 상태 코드
    private String message;   // 응답 메시지
    private T data;           // 실제 데이터 (제네릭으로 타입 정의)

    // 생성자
    public ApiResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // Getter & Setter
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // 성공 응답을 생성하는 정적 메서드
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(200, "Success", data);
    }

    // 실패 응답을 생성하는 정적 메서드
    public static <T> ApiResponse<T> error(String message, int status) {
        return new ApiResponse<>(status, message, null);
    }
}


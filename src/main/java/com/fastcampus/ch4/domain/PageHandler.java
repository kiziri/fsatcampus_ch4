package com.fastcampus.ch4.domain;

public class PageHandler {

    private int pageSize;    // 한 페이지의 크기
    public final int NAV_SIZE = 10;    // 페이지 내비의 크기
    private int totalCnt;    // 총 게시물 갯수
    private int totalPage;   // 전체 페이지의 갯수
    private int page;        // 현재 페이지
    private int beginPage;   // 화면에 보여줄 첫 페이지
    private int endPage;   // 화면에 보여줄 마지막 페이지
    private boolean showNext = false; // 이후를 보여줄지의 여부. endPage==totalPage이면, showNext는 false
    private boolean showPrev = false; // 이전을 보여줄지의 여부. beginPage==1이 아니면 showPrev는 false

}

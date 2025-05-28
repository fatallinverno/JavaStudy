# 전자문서 관리 시스템 ERD

```mermaid
erDiagram
    CATEGORY ||--o{ DOCUMENT : "분류_됨"

    DOCUMENT {
        int DocumentID PK "문서 ID"
        varchar FileName "파일 이름"
        int SerialNumber "일련 번호"
        varchar FileType "파일 유형"
        date UploadDate "업로드 날짜"
        int FileSize "파일 크기"
        int CategoryID FK "분류 ID"
    }

    ACCOUNTSLIP {
        int DocumentID PK,FK "문서 ID"
        date SlipDate "전표 날짜"
        text Description "적요"
        decimal Income "수입"
        decimal Expense "지출"
        text Remarks "비고"
    }

    EBOOK {
        int DocumentID PK,FK "문서 ID"
        varchar Title "제목"
        varchar Author "저자"
        varchar Publisher "출판사"
    }

    CATEGORY {
        int CategoryID PK "분류 ID"
        varchar LargeCategory "대분류"
        varchar MiddleCategory "중분류"
        varchar SmallCategory "소분류"
    }

# 전자문서 관리 시스템 ERD

```mermaid
erDiagram
    Document {
        BIGINT document_id PK "전자문서 ID"
        VARCHAR file_name "파일 이름"
        VARCHAR file_type "파일 유형"
        BIGINT category_id FK "분류코드 ID"
        ENUM document_type "문서 유형"
        DATETIME created_at "생성 일시"
    }

    AccountingSlip {
        BIGINT slip_id PK "회계전표 ID"
        BIGINT document_id FK "전자문서 ID"
        DATE date "날짜"
        VARCHAR description "적요"
        DECIMAL income "수입"
        DECIMAL expense "지출"
        TEXT note "비고"
    }

    EBook {
        BIGINT ebook_id PK "전자책 ID"
        BIGINT document_id FK "전자문서 ID"
        VARCHAR title "제목"
        VARCHAR author "저자"
        VARCHAR publisher "출판사"
    }

    Category {
        BIGINT category_id PK "분류코드 ID"
        VARCHAR main_category "대분류"
        VARCHAR mid_category "중분류"
        VARCHAR sub_category "소분류"
    }

    Document ||--|| AccountingSlip : "회계전표 정보"
    Document ||--|| EBook : "전자책 정보"
    Document }o--|| Category : "분류 코드"

# 전자문서 관리 시스템 ERD

```mermaid
erDiagram
    Document {
        BIGINT document_id PK "전자문서 ID"
        VARCHAR file_name "파일 이름"
        VARCHAR file_type "파일 유형"
        ENUM document_type "문서 유형"
        DATETIME created_at "생성 일시"
        VARCHAR main_category_code FK "대분류 코드"
        VARCHAR mid_category_code FK "중분류 코드"
        VARCHAR sub_category_code FK "소분류 코드"
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
        VARCHAR main_category_code PK "대분류 코드"
        VARCHAR main_category_name "대분류 명칭"
        VARCHAR mid_category_code PK "중분류 코드"
        VARCHAR mid_category_name "중분류 명칭"
        VARCHAR sub_category_code PK "소분류 코드"
        VARCHAR sub_category_name "소분류 명칭"
    }

    Document ||--|| AccountingSlip : "회계전표 정보"
    Document ||--|| EBook : "전자책 정보"
    Document }o--|| Category : "분류 코드"

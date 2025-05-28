# 전자문서 관리 시스템 ERD

```mermaid
erDiagram
    Document {
        BIGINT document_id PK "문서 ID"
        VARCHAR title "문서 제목"
        VARCHAR main_category_code FK "대분류 코드"
        VARCHAR mid_category_code FK "중분류 코드"
        VARCHAR sub_category_code FK "소분류 코드"
    }

    MainCategory {
        VARCHAR main_category_code PK "대분류 코드"
        VARCHAR name "대분류명"
    }

    MidCategory {
        VARCHAR mid_category_code PK "중분류 코드"
        VARCHAR main_category_code FK "대분류 코드"
        VARCHAR name "중분류명"
    }

    SubCategory {
        VARCHAR sub_category_code PK "소분류 코드"
        VARCHAR mid_category_code FK "중분류 코드"
        VARCHAR name "소분류명"
    }

    Document ||--o{ MainCategory : "대분류 참조"
    Document ||--o{ MidCategory : "중분류 참조"
    Document ||--o{ SubCategory : "소분류 참조"

    MidCategory }o--|| MainCategory : "대분류 소속"
    SubCategory }o--|| MidCategory : "중분류 소속"


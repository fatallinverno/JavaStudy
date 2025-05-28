# 전자문서 관리 시스템 ERD

```mermaid
erDiagram
    Document {
        BIGINT document_id PK
        VARCHAR file_name
        VARCHAR file_type
        BIGINT category_id FK
        ENUM document_type
        DATETIME created_at
    }

    AccountingSlip {
        BIGINT slip_id PK
        BIGINT document_id FK
        DATE date
        VARCHAR description
        DECIMAL income
        DECIMAL expense
        TEXT note
    }

    EBook {
        BIGINT ebook_id PK
        BIGINT document_id FK
        VARCHAR title
        VARCHAR author
        VARCHAR publisher
    }

    Category {
        BIGINT category_id PK
        VARCHAR main_category
        VARCHAR mid_category
        VARCHAR sub_category
    }

    Document ||--|| AccountingSlip : has
    Document ||--|| EBook : has
    Document }o--|| Category : "categorized by"

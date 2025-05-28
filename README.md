# 전자문서 관리 시스템 ERD

```mermaid
erDiagram
    CATEGORY ||--o{ DOCUMENT : "분류_됨"

    DOCUMENT {
        int DocumentID PK
        varchar FileName
        int SerialNumber
        varchar FileType
        date UploadDate
        int FileSize
        int CategoryID FK
    }

    ACCOUNTSLIP {
        int DocumentID PK,FK
        date SlipDate
        text Description
        decimal Income
        decimal Expense
        text Remarks
    }

    EBOOK {
        int DocumentID PK,FK
        varchar Title
        varchar Author
        varchar Author
        varchar Publisher
    }

    CATEGORY {
        int CategoryID PK
        varchar LargeCategory
        varchar MiddleCategory
        varchar SmallCategory
    }

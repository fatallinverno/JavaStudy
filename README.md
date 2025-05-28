'''merried
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
        varchar Publisher
    }

    CATEGORY {
        int CategoryID PK
        varchar LargeCategory
        varchar MiddleCategory
        varchar SmallCategory
    }

    ' 상속 관계 (Generalization/Specialization)는 Mermaid erDiagram에서 직접적인 문법으로 지원하지 않습니다.
    ' 하지만 ACCOUNT_SLIP과 EBOOK의 DocumentID가 PK, FK로 DOCUMENT의 PK를 참조하는 것으로
    ' IS-A 관계를 암시적으로 표현합니다.
    ' 아래는 가상의 상속 관계를 보여주는 표현이며, 실제 다이어그램에는 나타나지 않습니다.
    ' DOCUMENT ||--o{ ACCOUNTSLIP : "is_a"
    ' DOCUMENT ||--o{ EBOOK : "is_a"

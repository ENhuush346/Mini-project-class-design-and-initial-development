4-р өдөр: Мини төслийн загварчлал ба эхний хэрэгжүүлэлт
Төслийн тойм
Энэхүү мини төсөл нь 3-р өдрийн шинжилгээнд үндэслэн Warehouse системийн анхан шатны классуудыг загварчилж, хэрэгжүүлэхэд чиглэгдсэн. Odoo-ийн модулийн зарчмаар Warehouse, Product, StockMove зэрэг классуудыг бүтэцлэн, OOP-ийн инкапсуляци, удамшил зэрэг зарчмуудыг ашиглав. Төсөл нь бараа нэмэх, хасах, нөөц шилжүүлэх үйлдлийг энгийн байдлаар гүйцэтгэхэд зориулагдсан.

Классын загвар
Warehouse
Product болон StockMove-ын жагсаалт агуулна. Барааг удирдах функцуудыг хэрэгжүүлнэ (жишээ нь: addProduct, removeProduct).

Product
Барааны нэр, үнэ, тоо хэмжээ зэрэг атрибутуудтай. Удамшил ашиглан тусгай төрөл (жишээ нь, ServiceProduct) нэмэх боломжтой.

StockMove
Нөөц шилжүүлэлтийг төлөөлнө. fromLocation, toLocation зэрэг талбаруудтай.

OOP зарчмууд
Инкапсуляци: Хувийн атрибутууд, нийтийн getter/setter-үүд.

Удамшил: Product классыг өргөтгөж, төрөлжүүлэлт хийх боломжтой.

Модуляр бүтэц: Классууд нэг үүрэгт төвлөрсөн.

Хэрэгжүүлэлтийн товч
Warehouse класс:

addProduct(Product product)

removeProduct(String productName)

listProducts()

Product класс: нэр, үнэ, тоо хэмжээ

StockMove класс: эхлэх, очих байршил

Туршилт
Локал дээр бараа нэмэх, устгах, жагсаалтыг хэвлэх үйлдлүүдийг амжилттай туршсан.
Class: Warehouse
- name: String
- products: List<Product>
- stockMoves: List<StockMove>
+ addProduct(p: Product): void
+ removeProduct(p: Product): void
+ listProducts(): void

Class: Product
- name: String
- price: double
- quantity: int

Class: StockMove
- product: Product
- quantity: int
- fromLocation: String
- toLocation: String
- date: LocalDate

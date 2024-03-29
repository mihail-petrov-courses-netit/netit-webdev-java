# Банката на утрешният ден


Местна банка, вперила поглед в бъдещето, се свързва с вашият екип с молба за съдействие. До
ушите на оперативният директор е достигнал силно преувеличен слух че вашите заложби като
програмист на бази данни силно надминават тези на напълно начинаещите в тази област.
Банката желае да разшири бизнес дейността си и за тази цел и трябва помощ с разработката на
решения свързани със системата и за съхранение на информация.
Вашата задача е да създадете решение за нуждите на вашият клиент на базата на неговите
изисквания.

## Архитектура на проекта:

Банката разполага със следната вътрешна структура.

### Служители.
Всеки служител на банката се характеризира със следните основни данни
- Първо Име,
- Фамилия,
- Допълнително име за служители които имат повече от две имена.
- Адрес за кореспонденция,
- мобилен телефон
- електронна поща
- длъжност
- отдел

Допълнителна информация, някой служители имат ръководители, ръководителя е началник на
определени служители. Във всеки момент се знае точно на кои от тях.

### Отдели
Отделите са структурите в които работят служителите на банката, например отдел Операции които
се занимава с финансовите транзакции, отдел Кредитен анализ, които оценява заявките за кредити
и прочие.

Отделите се характеризират със следните основни данни
- Название на отдела

### Клиенти
Клиентите са кръвта на всяка една банка, или поне такъв е слогана в главната канцелария. За вас те
са просто редове в таблица, разбира се. Всички клиенти се характеризират със следните основни данни.
- Първо Име,
- Фамилия,
- Допълнително име за служители които имат повече от две имена.
- Адрес за кореспонденция,
- мобилен телефон
- електронна поща

Всеки клиент има сметка в банката, задължително една, но може и много повече. Сметката е
произволно цяло число или набор от букви. Задължително е сметките на всеки един клиент да
бъдат уникални, не е възможно да се съдържат двама клиенти с една и съща сметка.
Всяка сметка разполага с някакво количество пари.
Сметките винаги са в някаква валута, като по подразбиране при създаването си, валутата е BGN
ако друга не е упомената.

**Архитектурни задачи**

Да се създаде исканата описана от банката структура, с помощта на необходимите DDL
заявки. Където е необходимо спазвайте изискванията за първични и външни ключове.
Напълнете новосъздадените от вас таблици със значещи данни. Данните ще са ви
необходими за да тествате голяма част от заявките, които ви предстои да напишете, така че е
възможно да се наложи този процес да се повтори неколкократно.
Не забравяйте клиентите често не знаят какво искат, така че е възможно да се наложи промяна по
структурата на таблиците които вече дефинирахте.

**Заявки**

- Да се създаде листинг на имената на всички отдели в банката
- Да се създаде листинга на месечните възнаграждения на всички служители, в листинга е
необходимо да присъстват двете имена на служителя и неговата заплата
- Да се създаде листинг на всички служители в банката в листинга трябва да присъстват
двете имена на служителите и новогенерирани E-mail адреси, които да се състоят от
конкатенирани първото и второ име на служителя разделени с точка. Имената на
служителите трябва да бъдат с малки букни в мейла. Домейна на компанията е
bankoftomarow.bg
- Намерете всички служители които банката дефинира като старши служители. Старши
служители са всички които работят в компанията от 5 години.
- Намерете всички служители чиито първи имена започват с буквата S
- Намерете всички чуждестранни служители. Чуждестранни са тези служители които не са
родени в България.
- Намерете всички служители чиите имена (първо / второ или допълнително съдържат
буквата l)

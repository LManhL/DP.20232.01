### Bài 2: Coupling
- Package common: data coupling 
- Package controller: chứa nhiều common coupling do SessionInformation cung cấp global data mà không quản lý dẫn tới hàng loạt 
- Package dao: data coupling 
- Package entity: Cart/checkMediaInCart() stamp coupling, Media/getQuantity() content coupling, Oder constructor stamp coupling, common coupling, DeliveryInfo/calculateShippingFee() stamp coupling
- Package subsystem: InterbankPayloadConverter/extractPaymentTransaction() control coupling
- Package utils:  ApplicationProgrammingInterface/allowMethods() content coupling, MyMap/toMyMap() content coupling
- package views: common coupling: CartScreenHandler/setupFunctionality(), requestToPlaceOrder(), displayCartWithMediaAvailability(), MediaHandler/setMediaInfo(), HomeScreenHandler/setupData(), setupFunctionality(), setImage(), update(), redirectLoginScreen(), InvoiceScreenHandler/setupData(), confirmInvoice(), PaymentScreenHandler/confirmToPayOrder(),PopupScreen/ PopupScreen(), success(), error(), loading(), ShippingScreenHandler/setupData(), submitDeliveryInfo(), App/start() //stamp coupling: HomeScreenHandler/setupData(), redirectLoginScreen(), LoginScreenHandler/setupData(), IntroScreenHandler/setupData(), PopupScreen/setupData().

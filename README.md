透過 ViewModel，使用API服務，從網路擷取經濟部水庫水情的資料。  
第二版不在MainActivity中聯繫UI(Composable)和UI的狀態(ViewModel)，  
而是讓Composable直接取得ViewModel中的資料。  
使用ViewModel保存Composable的狀態。  
狀態只有三種，Success、Error、Loading。  
使用密封類定義這三個狀態。  
ViewModel只有唯一一個屬性，代表對應UI的狀態，這個狀態只有那三種可能的值  
其中只有Success狀態的裡面，具有從網路擷取而來的資料  

#include<iostream>
using namespace std;
int main(){
int energi, kecepatan;
string arah, keterangan, keterangan2, warna;
cout<<"Masukan Warna = "; cin>>warna;
cout<<"Mengisi Energi = "; cin>>energi;
cout<<endl;
cout<<"Nyalakan Mesin Y/T = "; cin>>keterangan;
if(keterangan=="Y"||keterangan=="y"){
cout<<endl<<"Terbang/Turun =";
cin>>keterangan2;
if(keterangan2=="terbang"){
cout<<"Tambah Kecepatan = ";cin>>kecepatan;
cout<<"Arah = ";cin>>arah;
cout<<endl;
}
else{
cout<<"Kurangi kecepatan = ";cin>>kecepatan;
cout<<"Arah = ";cin>>arah;
cout<<endl;
}
cout<<"Warna Pesawat Tempur = "<<warna<<endl;
cout<<"Ketinggian = "<<kecepatan+1000<<"Kaki"<<endl;
cout<<"Energi = "<<energi-kecepatan/100<<endl;
cout<<"Arah = "<<arah<<endl;
}
else{
cout<<endl<<"OFF"<<endl;
cout<<"Warna Pesawat Tempur = "<<warna<<endl;
cout<<"Ketinggian = - Kaki"<<endl;
cout<<"Energi = -"<<endl;
cout<<"Arah = -"<<arah<<endl;
}
}

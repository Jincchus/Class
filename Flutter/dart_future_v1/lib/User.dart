import 'package:dart_future_v1/Address.dart';
import 'Company.dart';

class User {
  int? id;
  String? name;
  String? username;
  String? email;
  Address? address;
  String? phone;
  String? website;
  Company? company;

  // 강제성 - 생성자
  User(this.id, this.name, this.username, this.email, this.address, this.phone,
      this.website, this.company); // 생성자1.기본 생성자

  // 생성자2.명명된 생성자 - Map을 넣으면 User 오브젝트가 반환되는 코드 작성
  // 이니셜 라이저 (변수를 초기화 해주는 문법)
  User.fromJson(Map<String, dynamic> json)
      : id = json["id"],
        name = json["name"],
        username = json["username"],
        email = json["email"],
        address = json['address'] != null ? Address.fromJson(json['address']) : null,
        phone = json['phone'],
        website = json['website'],
        company = json['company'] != null ? Company.fromJson(json['company']) : null;

  @override
  String toString() {
    return 'User{id: $id, name: $name, username: $username, email: $email, address: $address, phone: $phone, website: $website, company: $company}';
  }
}


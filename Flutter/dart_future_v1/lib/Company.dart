class Company{
  String? name;
  String? catchPharse;
  String? bs;

  Company(this.name, this.catchPharse, this.bs);

  Company.fromJson(Map<String, dynamic> json)
    : name = json["name"],
      catchPharse = json["catchPharse"],
      bs = json["bs"];

  @override
  String toString() {
    return 'Company{name: $name, catchPharse: $catchPharse, bs: $bs}';
  }
}
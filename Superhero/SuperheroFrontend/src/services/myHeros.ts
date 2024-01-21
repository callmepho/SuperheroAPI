import instance from "./axios";

export class MyHeros {
  public static async get(): Promise<any> {
    const data = await instance.get("/superheros");
    console.log(data);
    return data.data;
  }

  public static async create(hero: any): Promise<any> {
    const response = await instance.post("/superheros", hero);
    return response.data;
  }

  public static async delete(id: number): Promise<any> {
    const response = await instance.delete(`/superheros/${id}`);
    return response.data;
  }

  public static async put(id: number, hero: any): Promise<any> {
    const response = await instance.put(`/superheros/${id}`, hero);
    return response.data;
  }
}

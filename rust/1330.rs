use std::io;

fn main() {
    let mut input_string = String::new();
    io::stdin().read_line(&mut input_string).expect("error occured");
    let input_vector: Vec<i32> = input_string.split_whitespace().map(|elem| { elem.parse::<i32>().unwrap() }).collect();

    if input_vector[0] > input_vector[1] {
        println!(">");
    } else if input_vector[0] == input_vector[1] {
        println!("==");
    } else {
        println!("<");
    }
}

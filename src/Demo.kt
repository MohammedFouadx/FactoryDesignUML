class Demo{



}


fun main(args: Array<String>) {
    val virus:Virus;
    virus = VirusFactory().makeVirus(VirusType.INFLUENZA);
    virus.mutate();
}
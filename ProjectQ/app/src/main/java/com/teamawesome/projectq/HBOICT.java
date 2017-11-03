public class HBOICT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hboict);

        Button navBusiness = (Button) findViewById(R.id.busBtn);
        Button navITSM = (Button) findViewById(R.id.itsmBtn);
        Button navSE = (Button) findViewById(R.id.seBtn);
        Button navSAX = (Button) findViewById(R.id.saxionBtn);
        Button Site1 = (Button) findViewById(R.id.Site1);
        Button Site2 = (Button) findViewById(R.id.Site2);


        // functie knop Business
        navBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(HBOICT.this, Business.class);
                startActivity(intent1);
            }
        });

        // functie knop ITSM
        navITSM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(HBOICT.this, ITSM.class);
                startActivity(intent2);
            }
        });

        // functie knop SE
        navSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(HBOICT.this, SoftwareEngineering.class);
                startActivity(intent3);
            }
        });

        // functie knop Sax
        navSAX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.saxion.nl/studeren/kiezen_en_kennismaken/Studiekiezer/act/hbo-ict/hbo-ict/"));
                startActivity(intent4);
            }
        });

        Site1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vanbeers.ddns.net/saxion/posb/index.html" ));
                startActivity(intent5);
            }
        });

        Site2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hbo-ict.tk/" ));
                startActivity(intent6);
            }
        });


    }
}

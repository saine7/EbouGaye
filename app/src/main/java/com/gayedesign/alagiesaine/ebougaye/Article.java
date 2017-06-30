package com.gayedesign.alagiesaine.ebougaye;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Article extends ListFragment {

    ListView listView;
    int curPosition = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View view = inflater.inflate(R.layout.fragment_article,container,false);

        ListAdapter adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,ARTICLES);
        setListAdapter(adapter);

       return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        showDetails(position);
        //super.onListItemClick(l, v, position, id);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null){
            curPosition = savedInstanceState.getInt("savedCurPosition");
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("savedCurPosition",0);
    }

    private void showDetails(int position) {
        curPosition = position;
        Intent intent = new Intent(getActivity(),DetailsActivity.class);
        intent.putExtra("position",position);
        startActivity(intent);
    }
    static String[] ARTICLES = {"Beware","Dear Interviewee","Dilation on Press Freedom","Farewell to Dr Jean-Dominque Penel",
            "Gambian Literature Day","Good Servants or Bad Masters?","I Am Gambian Too","Isn’t that ironic?","The Key to Global Peace and Security",
            "What A Malicious Intention!","Meddlers or Helpers?","New Year Message","No Time for Squabble",
            "Oh, Opportunist!","You Are Opportunists, Not Patriots","Take it easy!","That serves you right!","The Heroine","Using Pseudonym: Is it proper or improper?",
            "What a Danger!","What an Irony!","Who is the problem?","You Are To Blame, Yahya"};



    static final String[] ARTICLE_DETAILS = {
            "<font color=\"black\"><b>Beware!</b><br>" +
                    "<br>" +
                    "Beware!<br>" +
                    "Many powerful voices have sounded a warning to your commander-in-chief but to no avail<br>" +
                    "He senselessly and shamelessly remains recalcitrant,<br>" +
                    "Turning deaf ears and blind eyes to the reality,<br>" +
                    "Believing erroneously that he can manoeuvre his way out of the awkward situation in which he has found himself,<br>" +
                    "And cling onto power with the aim of escaping justice,<br>" +
                    "As well as continuing his flamboyant, extravagant and lavish lifestyle, <br>" +
                    "While victimizing and brutalizing his compatriots<br>" +
                    "<br>" +
                    "Beware!<br>" +
                    " Many wise men and women have tried to talk sense to you with the hope that you will see reason unlike your unreasonable, immature and mischievous commander-in-chief,<br>" +
                    "And do what is expected of a sober, patriotic citizen<br>" +
                    "Nonetheless, I feel obliged to add my voice by addressing you accordingly<br>" +
                    "Your commander-in-chief and the members of his inner circle are treating you as a bunch of fools which I strongly believe you are not<br>" +
                    "They want to use you as cannot fodders by placing you on the front line to be bombed to tiny pieces in case of military intervention which is imminent,<br>" +
                    "While they hide in bunkers,<br>" +
                    "After evacuating their close family members to safe havens<br>" +
                    "<br>" +
                    "Beware!<br>" +
                    "I understand that the chief spin doctor of your commander-in-chief is instigating you to wreak havoc on our beloved country in case of military intervention,<br>" +
                    "By recklessly destroying valuable properties and killing your compatriots <br>" +
                    "Remember that the heartless, unscrupulous spin doctor and his close family members are currently living safely and comfortably in the US,<br>" +
                    "And that you and many of your family members and loved ones are living in our beloved country<br>" +
                    "Bear in mind that the wicked spin doctor has very little or nothing absolutely to lose whereas you have so much or everything to lose if you do as his wishes<br>" +
                    "<br>" +
                    "<br>" +
                    "<br>" +
                    "Beware!<br>" +
                    "You know better than I do that the proposed intervention forces are no match to you in terms of might<br>" +
                    "You, I and everyone else know very well that your chances of survival are very slim- or next to nil- if you dare to face the intervention forces<br>" +
                    "Woe betide you if you dare to do so!<br>" +
                    "You will certainly suffer a humiliating, miserable defeat if you do that, <br>" +
                    "As you will be reduced to rubble or dust<br>" +
                    "You will be living in a fool’s paradise if you believe otherwise <br>" +
                    "Fighting the intervention forces would be very absurd, illogical and imprudent of you,<br>" +
                    "As it would be tantamount to committing suicide<br>" +
                    "What purpose- if there is any- does it serve to fight a battle that you are sure you will lose woefully?<br>" +
                    "What will you gain by destroying your country, killing your compatriots and jeopardizing your lives and the lives of your family members and loved ones in the process?<br>" +
                    "Whose interest will you serve by doing that, as the chief spin doctor wants you to do?<br>" +
                    "<br>" +
                    "Beware!<br>" +
                    "I hope you now understand that your cruel, greedy and selfish commander-in-chief and the members of his inner circle are trying to outwit or outsmart you by using you in their malicious, monstrous scheme<br>" +
                    "Abhor and avoid that!<br>" +
                    "I hope you will do the right, rational thing<br>" +
                    "Jump ship and abandon your commander-in-chief for the sake of our dear nation, your personal good and the interest of your family members and loved ones<br>" +
                    "Let your commander-in-chief use his “supernatural/mystical powers” to defend himself<br>" +
                    "That way, you will avert war and help save precious lives and properties<br>" +
                    "The time is ripe!</font><br>" +
                    "<br>"
            ,
            "<font color=\"black\"><b>Dear Interviewee</b><br>" +
                    "<br>" +
                    "Dear Interviewee,<br>" +
                    "I have listened to your interview with keen interest and rapt attention<br>" +
                    "I dub it the interview of the millennium,<br>" +
                    "As it is engrossing, gripping and innervating,<br>" +
                    "Prompting me to key these lines of mine,<br>" +
                    "To do what linguists call discourse analysis<br>" +
                    "   <br>" +
                    "Dear Interviewee,<br>" +
                    "You said that you don’t castigate the opposition,<br>" +
                    "As they are citizens like you and should be treated as such,<br>" +
                    "That Gambians are related,<br>" +
                    "And that one of the wives of a prominent opposition leader is your relative<br>" +
                    "What a good idea!<br>" +
                    "I concur with you unreservedly and extol you for uttering such words of wisdom,<br>" +
                    "As this is exactly what we are fighting for<br>" +
                    "I wish your master and other gang members viewed matters from the same angle,<br>" +
                    "For we would live peacefully and harmoniously if they did<br>" +
                    "<br>" +
                    "Dear Interviewee,<br>" +
                    "You hinted that a disappeared journalist died while trying to travel to the West by sea<br>" +
                    "This is no news to us,<br>" +
                    "For your master is the first one to say it<br>" +
                    "So, you were just conveying his message to us<br>" +
                    "What an implausible postulation!<br>" +
                    "This is insulting to the intelligence of the Gambians, to say the least!<br>" +
                    "The journalist was allegedly arrested at his office by NIA officers after his boss reported him to them<br>" +
                    "Your master should order the interrogation of his boss and the NIA officers involved if he is genuinely interested in getting to the bottom of the matter<br>" +
                    "The case of the journalist was taken to the ECOWAS court<br>" +
                    "Your government was summoned but it treated the court with contempt,<br>" +
                    "By failing to answer despite several adjournments and reminders<br>" +
                    "The court eventually ruled in favour of the journalist,<br>" +
                    "But your government flatly refused to comply with the ruling<br>" +
                    "Is this a fair treatment to the journalist and his loved ones?<br>" +
                    "Is it proper to deal with a regional body like the ECOWAS in this manner?<br>" +
                    "<br>" +
                    "Dear Interviewee,<br>" +
                    "You said that your master sent a delegation to pay a visit of condolence to the family of an assassinated journalist,<br>" +
                    "Suggesting his innocence in the case<br>" +
                    "Your assumption is untenable<br>" +
                    "If your master is innocent and so sympathetic with the bereaved family, why is he reluctant to track down and punish the culprits?<br>" +
                    "Why does he fly into a rage or fume whenever the name of the journalist is mentioned by his colleagues and human rights defenders?<br>" +
                    "<br>" +
                    "Dear Interviewee,<br>" +
                    "You attempted to exonerate yourself and your government regarding the massacre of school children in the April 2000,<br>" +
                    "Arguing that you were told by the security forces who briefed you that the shooting started from the children<br>" +
                    "But you didn’t mention that briefing by the security forces in your statement back in 2000<br>" +
                    "If my memory serves me right, you only said it was the children who started the shooting<br>" +
                    "What a lame excuse!<br>" +
                    "If the children actually fired shots at the security forces, how come none of the members of the security forces was hurt?<br>" +
                    "Why didn’t you tell the security forces to use tear gas or rubber bullets to quell the demonstration rather using live bullets?<br>" +
                    "Why didn’t they grant the children permission as requested and escort them during the demonstration to ensure peace,<br>" +
                    " Instead of threatening to crush them and later carried out their threat with utmost brutality? <br>" +
                    " <br>" +
                    "Dear Interviewee,<br>" +
                    "You said the owners of Pristine Company had apologized to your government,<br>" +
                    "And that the problem was due to misunderstanding which had been ironed out,<br>" +
                    "Implying confession of guilt on their part<br>" +
                    "But those acquainted with the case have said the contrary holds,<br>" +
                    "That in fact it is your government that had apologized<br>" +
                    "In either case, what your government has done to them is disheartening<br>" +
                    "Don’t you think that your master’s act will discourage other Diaspora Gambians who were contemplating investing or utilizing their expertise and skills in their country of origin?<br>" +
                    "If the owners of Pristine Company can live and study peacefully and happily on a foreign land, isn’t it shameful and unjust to harass them or infringe on their rights or properties in their native country?<br>" +
                    "<br>" +
                    "Dear Interviewee,<br>" +
                    "You asserted that the highly charged situation in The Gambia has no negative effects on the tourism industry,<br>" +
                    "Claiming that there are more tourists now that before,<br>" +
                    "But added that the tourism minister who is part of your delegation to New York is currently having a series of meetings trying to woo people to visit your country<br>" +
                    "If the tourism industry was booming as you claimed, why would the minister waste her valuable time and energy to persuade people to visit your country?<br>" +
                    "Do you honestly and sincerely think that the behaviour of your master cannot discourage potential tourists and foreign investors?   <br>" +
                    "<br>" +
                    "Dear Interviewee,<br>" +
                    "You said that an ex-functionary of your government was accused of misappropriating public funds,<br>" +
                    "Challenging him to clear his name or apologize for his alleged wrong doing,<br>" +
                    "Saying scornfully that he is young and that he was merely a soldier when your master appointed him   <br>" +
                    "I am not holding brief for the accused,<br>" +
                    "As it is said that the bereaved can mourn the deceased himself<br>" +
                    "But I hasten to note that I will treat the allegation with suspicion until it is proven,<br>" +
                    "For this is not strange in your government<br>" +
                    "Your master is fond of accusing people of economic crime,<br>" +
                    "As a way of smearing their names or eliminating his perceived enemies<br>" +
                    "Examples abound<br>" +
                    "Just turn round and do the counting yourself<br>" +
                    "How can we be convinced that this case is not a replica of the previous ones?<br>" +
                    "The accused person has defended himself by giving his version,<br>" +
                    "And countered by levelling serious allegations against you<br>" +
                    "Will you come out and defend yourself publicly as he has done?<br>" +
                    "Your master became superfluously wealthy shortly after coming to power<br>" +
                    "He drags people to commissions of enquiry but has never offered to disclose the source of his wealth or volunteered to face his innumerable commissions<br>" +
                    "What is your take on this? <br>" +
                    "Do you really think that your master is clean as he pretends to be?<br>" +
                    "Is he morally justified in accusing people of corruption or embezzlement? <br>" +
                    "Your contemptuous remarks have amply demonstrated the fact that you hold soldiers in a very low esteem<br>" +
                    "Have you forgotten that the master you treat as a demigod is a retired soldier and was a colleague of the accused?<br>" +
                    "How would you compare the accused to your master in terms of educational and professional background, or experience in governance when the pair mounted positions of responsibility in your government? <br>" +
                    "<br>" +
                    "Dear Interviewee,<br>" +
                    "You told the interviewer that your master had sent his mother to the Holy City of Mecca to perform pilgrimage,<br>" +
                    "Contending that he should put this into account and desist from criticizing your master<br>" +
                    "The interviewer responded by arguing that he is entitled to his opinions, views and position, just as his people are entitled to theirs<br>" +
                    "You added that your master is compassionate and thus helps people irrespective of who they are and whether he knows them or not<br>" +
                    "But contradicted yourself sharply when the interviewer asked you whether your master had paid people to go to the State House to express solidarity with him regarding the recent executions,<br>" +
                    "Saying that your master has no money to dish out and that he would rather use the money to develop the country if he had it<br>" +
                    "Which is which?<br>" +
                    "Is your master wealthy or not wealthy?<br>" +
                    "Doesn’t he dish out money to individuals?  <br>" +
                    "I am cocksure that your master is rich, and put it to you that he in fact dishes out money to individuals, both the destitute and the well-off<br>" +
                    "Based on your contention that the interviewer should not censure your master because he has sent his mother to Mecca, I conclude that your master gives money to people for political reasons,<br>" +
                    "Not in the cause of God or out of benevolence as he and sycophants like you want to fool us into believing<br>" +
                    "Simply put, your master uses his loot to buy loyalty<br>" +
                    "Am I right or wrong? <br>" +
                    "Would you help tell us the source of the money your master spends lavishly and why he behaves in such a way?<br>" +
                    "<br>" +
                    "Dear Interviewee,<br>" +
                    "You claimed that the interviewer lacks the capacity to serve in a future government,<br>" +
                    " Not knowing that he was the very one you were talking to  <br>" +
                    "Do you believe that he is less qualified than all those working with your government? <br>" +
                    "How would you rate his capability or qualification as opposed to that of your master?   <br>" +
                    "If the interviewer was as incapable or unqualified as you claimed, would he be able to outwit or outsmart you- you the “highly qualified” serving in the second highest position of your government?  <br>" +
                    "How did he manoeuvre his way and interview you against your will? <br>" +
                    "<br>" +
                    "Dear Interviewee,<br>" +
                    "You said that you had met with the president of Senegal,<br>" +
                    "Claiming that he told you he had no qualms regarding the execution of two Senegalese nationals by your master,<br>" +
                    "That even the Senegalese do execute people,<br>" +
                    "And that his reaction was a mere political gimmick meant to pacify his compatriots,<br>" +
                    "Adding that the US president did the same thing regarding the controversial film which has angered Muslims in different parts of the world and sparked violent protests<br>" +
                    "Do you know the implications of your statements?<br>" +
                    "It can be deduced from them that your government plays political gimmicks with Gambians and that it has no regard for them<br>" +
                    "    Do you think that all governments are like yours in this respect?<br>" +
                    "Why judge other governments by yours?<br>" +
                    "<br>" +
                    "Dear Interviewee,<br>" +
                    "You have committed a very big blunder<br>" +
                    "The interviewer has dealt you a tremendous blow and wrestled you down<br>" +
                    "He has plucked all your feathers and added more feathers to his cap of investigative journalist<br>" +
                    "I hope this will serve you as a lesson <br>" +
                    "How dare you discuss state and private or personal matters on the phone with a person you don’t know in this modern generation of ours?<br>" +
                    "Is it simply because the interviewer identified himself as a member of your gang?<br>" +
                    "Are you in short of supporters in the Diaspora and desperately trying to garner support from Diaspora Gambians?<br>" +
                    "<br>" +
                    "Dear Interviewee,<br>" +
                    "This is a good omen for the oppressed and a foreboding of a doom for the oppressors<br>" +
                    "It signals that the truth will soon triumph over falsehood <br>" +
                    "This is my interpretation<br>" +
                    "What is yours?  </font> <br>"
            ,
            "<font color=\"black\"><b>Dilation on Press Freedom</b><br>" +
                    "<br>" +
                    "As media practitioners and their sympathizers observe World Press Freedom Day, I would like to expatiate on press freedom with a view to contributing my quota to the promotion and defence of the fourth estate- the press.  <br>" +
                    "<br>" +
                    "Journalists suffer miserably in many parts of the world, Africa in particular. They are subjected to persecution in the form of banishment, harassment, arbitrary arrests, detention, incarceration, torture and assassination by tyrannical, oppressive regimes and bigoted,  unscrupulous individuals with the complicity of opportunists who behave like puppets, marionettes or zombies and are always eager to manipulate the law, endorse proposed draconian laws or promulgate decrees obstructing media practitioners, or carry out instructions to victimize or brutalize members of the press. What a pity!  It is either the case that those who wage war against journalists are oblivious to the importance of the fourth estate or that they are fully cognizant of its importance in society but have deliberately chosen to hamper journalists or violate their rights for selfish motives. The latter case is more likely, given the fact that those who persecute journalists want their good deeds to be publicized and, at the same time, want to see the bad deeds of their opponents exposed. The point is buttressed by the fact that dictatorial regimes befriend and sponsor praise-singing or pro-government media houses and journalists, granting them privileges, while discriminating against independent journalists whom they label as detractors, saboteurs and unpatriotic citizens who deserve severe punishment or death. This is exemplified by the behaviour of the Gambian leader, Yahya Jammeh towards the press. Jammeh has monopolized the state media, the Gambia Radio & Television Services and the pro-government newspaper, the Daily Observer of The Gambia which he patronizes and uses as his mouthpieces and propaganda machines. He is on record for having publicly called journalists illegitimate sons of Africa and threatening to take drastic measures against journalists who offend him.  Journalists have undergone torture, disappeared and died mysteriously under his watch, and private media houses set on fire, with the culprits going scot-free in all cases. That a sizeable number of Gambian journalists currently live in exile further demonstrates Jammeh’s hostile attitude towards journalists and his sheer aversion to press freedom. <br>" +
                    "  <br>" +
                    "The importance of the press cannot be over-emphasized. It informs, educates, enlightens and entertains besides serving as a watchdog.  I would not hesitate to vociferate that the press is indispensable with regard to the promotion of justice, democracy and respect for human rights, in the absence of which there cannot be meaningful, veritable and durable peace and development. It is a well known fact that those who bear malice against journalists and combat them do at times need their services and turn to them. Hence, the press should be viewed as a development partner, not an enemy. Suppressing press freedom means keeping people in the dark, which gives rise to rumour mongering whose accompaniments could be enormously detrimental and undesirable. <br>" +
                    "<br>" +
                    "It is worthy to note that any attempt made to muzzle the press arouses suspicion and attracts negative interpretations. Hatred or fear of journalists and the desire to silence, harm or eliminate them can be interpreted as fear of being exposed and an attempt to conceal or cover one’s misdeeds. If one is sure of having a clean record, or having no skeleton in his cupboard, as journalists would put, there is no need for him to try to gag the press. As the saying goes, it is he who has hidden something up that has a problem with people looking up and thus tries to prevent them from doing so. In other words, one would not care whether people look up or not if he has not hidden anything up which he wants to keep out of sight. Likewise, one would not mind journalists reporting his deeds or acts if he has not done anything wrong whose exposure can discredit him or cause embarrassment for him. People in positions of responsibility should bear in mind that their comportment and acts are of public interest and thus attract the attention of the press. They better dismount their positions or pack up and leave if they cannot behave ethically and rationally or conduct affairs as expected of them and feel that the press should spare them or refrain from calling them to order. My message to the enemies of the press is that attempting to silence journalists is an unattainable goal and that those who labour to achieve it are comparable to an elephant struggling to pass through the eye of a needle.     <br>" +
                    "<br>" +
                    "It is utterly illogical and unjustifiable to make attempts to muzzle the press. Media practitioners err sometimes but that should not prompt aggrieved parties to try to gag the press or harm its members. People of other occupations commit blunders without being subjected to persecution or attempts being made to impose a blanket ban on their activities. There is no career or profession in which practitioners are immune to mistakes. It is common knowledge that many people who reprimand or castigate journalists branding them as criminals for making mistakes are more reproachable or blameworthy than the latter in that they make much more serious mistakes. If mistakes are to be used as the sole excuse for clamping down on the activities of media practitioners, those press-phobic people and press-haters should quit their jobs first on account of their goofs or wrongdoings. Like people of other professions, media practitioners have formed organizations serving to bind them together and laid down codes of conduct which guide them in their work. Hence, journalists should be allowed to practise their profession unhindered if members of other professions are allowed to execute their duties without obstruction. Journalists have an inalienable right to practise their profession freely by virtue of the fact that they have a stake in the running of the affairs of their countries like other citizens. Where journalists are deemed not qualified enough to practise, efforts should be made to help them to develop themselves or ameliorate their skills through training. Governments, institutions and individuals can simply counter the words of journalists with words to set the record straight or prove their innocence when they are falsely accused or portrayed negatively. Alternatively, they can seek redress at the courts rather than resorting to violent or criminal acts when they feel offended by the press. This is much more rational and civilized than persecution.  <br>" +
                    "<br>" +
                    "However, I note in haste that journalists should endeavour to dig out correct information, report with utmost objectivity and criticize constructively when things go wrong, bearing in mind that freedom of expression does not mean freedom of infringement, encroachment or oppression. Put in crude terms, they should try as much as possible to abide by their codes of conduct and adhere to the ethics of their profession. This can facilitate their work and minimize the dangers associated with it.</font>     <br>"
            ,
            "<font color=\"black\"><b>Farewell to Dr Jean-Dominque Penel</b><br>" +
                    "By<br>" +
                    " Lydia Forster and Ebou Gaye<br>" +
                    "<br>" +
                    "The French Technical Assistant Dr Jean-Dominique Penel, commonly known as Monsieur Penel (M Penel), has gained popularity in The Gambia by virtue of his dedication and commitment to his work, coupled with his strong sense of devotion to his students and his keen interest in the promotion of Gambian literature and culture. M Penel has been rendering invaluable, meritorious services since his arrival in The Gambia in 1998. As an industrious, humble and affable person, he has made his presence felt in the academic environment of his students and in their day to day existence.  <br>" +
                    "<br>" +
                    "M Penel is the co-ordinator of the extension programme of l’Université de Limoges (University of Limoges) in France. This programme, which accommodates MA, MPhil and PhD students, is run under the auspices of the French Mission PADEF in The Gambia. M Penel has made it possible for Gambian students to pursue the programme at all three levels. As an action-oriented, efficient academician, he executes his duties perfectly and on time, thereby ensuring the smooth running of the programme.  <br>" +
                    "<br>" +
                    "Besides lecturing students of the above-mentioned programme and supervising their work, M Penel serves as a lecturer at Gambia College and the University of The Gambia. It is worthy to note that he is the initiator and the man in charge of the French BA degree programme of the University of The Gambia. <br>" +
                    "<br>" +
                    "Working in close collaboration with his diligent colleague, Madame Genevieve Sie, a French Technical Assistant responsible for the French HTC programme of Gambia College, training of upper basic and senior secondary school French teachers, school activities and the publication of the French magazine La Lune, M Penel has contributed immensely in promoting French in our schools and increasing its standard. <br>" +
                    "<br>" +
                    "M Penel plays a very vital role in the promotion of Gambian literature. He is the first French Technical Assistant to have taken interest in this important area, one can courageously say. <br>" +
                    "<br>" +
                    "He has introduced two courses on Gambian literature at the University of The Gambia and encouraged Pierre Gomez, a Gambian, to teach them. Superfluous to say, M Penel encourages students to do research work on Gambian literature. <br>" +
                    "<br>" +
                    "The indefatigable course co-ordinator and lecturer gives talks on Gambian literature and conducts exhibitions of Gambian literary works in different places in The Gambia and beyond Gambian borders, particularly in neighbouring Senegal. In this regard, he has visited Dakar, St Louis and Tambacounda with Gambian scholars such as Momodou Tangara, Pierre Gomez and Cherno Omar Barry, all of whom are lecturers at the University of The Gambia.<br>" +
                    "<br>" +
                    "M Penel has prepared a document entitled Bibliographic Inventory, which features all the Gambian literary works published in Ndaanan (1971-1976), Daily Observer (1992-2001) and The Independent (1999-2001). This is a very valuable document. If you are a researcher or interested to know about Gambian literary works or the role of the Gambian media in the promotion of Gambian literature, this is the right document to refer to. It is gratifying to note that one of the students of the above-mentioned programme has used this document in preparing both his MA and MPhil theses. <br>" +
                    "<br>" +
                    "Our serviceable friend introduces Gambian writers to the public and publicises their works in the French column of the Daily Observer. In this respect, he takes pains to contact Gambian writers wherever they are in the world. This has the good effect of earning budding Gambian writers public recognition and boosting their ego. Among Gambian writers featured by M Penel in this column are Lenrie Peters (dubbed the father of Gambian literature), The late Ebou Dibba (may his soul rest in perfect peace), Tijan Sallah, Ramatoulie Othman, Saikou Ceesay, Mariama Khan, Sally Singateh, Musa Jallow, Gabriel Roberts, Nana Grey-Johnson, Charles Sarr Thomas and Ebou Gaye, to name but a few. <br>" +
                    "<br>" +
                    "M Penel has translated into French a collection of poems written by the aforementioned Gambian literary giant, Lenrie Peters. The French version is due to be published soon, all being well. Needless to say, this will help render such an interesting work accessible to French readers.<br>" +
                    "<br>" +
                    "If there is one to be termed as a popular Frenchman, it is indeed M Penel. He is not only a popular Frenchman but one of the most popular Frenchmen to have served The Gambia.<br>" +
                    "<br>" +
                    "In a nutshell, M Penel has done a wonderful job. As a precious asset, his stay in The Gambia has proved to be very fruitful, one can rightly say. Thus, he has imprinted an indelible mark on our minds, which will continue to linger till doomsday. Therefore, he incontrovertibly deserves our commendation. Now that his mission is on the verge of ending and he is preparing to return home, we deem it fitting to render to Caesar what is due to Caesar by thanking M Penel and bidding him our adieu in this manner. We wish we could fulfil this obligation of ours in a better way! <br>" +
                    "<br>" +
                    "Bravo M Penel! Bon voyage!</font><br>" +
                    "<br>"
            ,
            "<font color=\"black\"><b>Gambian Literature Day</b><br>" +
                    "<br>" +
                    "Gambian writers, literature students of the University of The Gambia and other invited guests converged at the premises of Alliance Franco-Gambienne on Kairaba Avenue on Friday 30th January 2004 to celebrate what the initiator, Pierre Gomez dubbed Gambian Literature Day.  As a writer and an invitee with journalistic interest, I deem it fitting to report and comment on what transpired there for the benefit of those who had not been privileged to witness the occasion.  <br>" +
                    "<br>" +
                    "Regarding the speeches of the guests and the contributions of the members of the floor, I will confine myself to the main points which I judge the most important ones and try as much as possible to draw a clear distinction between my report and my commentary in order that the reader will not confuse the two.  As such, I accept full responsibility for any flaw or shortcoming in this piece and urge readers not attribute it to others who may be totally innocent.<br>" +
                    "<br>" +
                    "To acquaint the public with Gambian writers, photos of the latter and samples of their works with their biographies were displayed in the hall where the occasion was held.  Some speakers talked about literature and writing in general, whereas others limited themselves to Gambian literature or particular branches of literature, with writers talking about their works, answering questions posed or clarifying issues raised on the works by members of the floor who were accorded the opportunity to contribute freely in various ways, which made the discussion very interesting.<br>" +
                    "<br>" +
                    "Now, let me take the speakers one after the other, reporting and commenting, as pointed out earlier.<br>" +
                    "<br>" +
                    "Professor Edris Makward<br>" +
                    "The Vice-Chancellor of the University of The Gambia, Professor Edris Makward dilated on writing, opining that people should not write simply to become famous or get rich.  The learned professor contended that one may get rich and earn fame through writing like the British writer J K Rawling but that is a rare case.  He disclosed that a Gambian writer, Fodeh Baldeh has recently joined the University of The Gambia as a lecturer, expressing profound delight over the development.  Professor Makward concluded by extolling Gambian writers, exhorting them to continue writing.<br>" +
                    "<br>" +
                    "Superfluous to say, I concur with Professor Makward.  Although one may get rich or become famous through writing, the ultimate goal in writing should be to render services, right wrongs or promote peace and justice.  A writer who aspires after fame or riches inevitably abuses the power of the pen intentionally or inadvertently, thereby marring rather than making, wreaking havoc and jeopardizing lives.<br>" +
                    "<br>" +
                    "It is gratifying to learn that our fellow writer Fodeh Baldeh, the author of ‘The Fate of an African President’, has joined our university.  This is good in that it may go quite a long way in ensuring continuity.  I would therefore like to seize this opportunity to urge other Gambian intellectuals to emulate his example.  Like his compatriots at the university, Baldeh deserves commendation.  Credit also goes to the foreign members of staff for their invaluable, meritorious services.  Given the bitter fact that there were few Gambians willing and able to lend helping hands with the running of the university at the time of its establishment, one can say frankly that it would not stand on its feet without the kind assistance of foreign experts.  It goes without saying that establishing an institution of higher education like the University of The Gambia is a bold, laudable initiative on the part of the Gambia Government in that it is a challenging, burdensome and onerous task that has long been overdue, but as I always say, better late than never.  Now that we have a university at our doorsteps thanks to our government, it is incumbent on all Gambians to contribute their quota in one way or the other to ensure its continuity and smooth running.  It is in cognisance of this fact that Professor Makward welcomed Fodeh Baldeh at the university with open arms and immense pleasure.<br>" +
                    "<br>" +
                    "Janet Badjan-Young<br>" +
                    "The Gambian playwright Janet Badjan-Young talked about writing in general, laying emphasis on drama and one of her plays.  According to her, writers should not only highlight problems but also seek to remedy adverse situations.  Mrs Young asserted that she encourages virtues and discourages vices in her writings.  Answering the question why she has produced a play on the campaign against the spread of HIV/AIDS now and not before, suggesting a degree of lateness in her intervention, she clarified that the idea did not originate from her, explaining that she was approached by a group of campaigners and requested to write the piece, with which she complied fully and happily.<br>" +
                    "<br>" +
                    "It is good to pinpoint problems but spotting problems and giving suggestions on how to solve them at the same time is more beneficial.  Likewise, instilling or inculcating virtues and rooting out voices at one go yields more benefits than dealing with one while neglecting the other or treating it with indifference.  So, Madam Young got it perfectly right.  The fact that Mrs Young declared that the idea of writing a play on HIV/AIDS originated from the campaigners and that she wrote the play as a way of contributing to the fight against this alarming disease amply demonstrates how sincere, compassionate and serviceable she is.  Even if her intervention came a bit late as implied by the enquirer, she has done something laudable.  Bravo, Madam! <br>" +
                    "<br>" +
                    "Hassoum Ceesay<br>" +
                    "Hassoum Ceesay, a literary critic, a historian and a curator at the Gambia National Museum gave a talk on Gambian Literature.  Mr Ceesay expatiated on the emergence and development of Gambian literature, tracing its origin to Phyllis Wheatley who, according to him, is the first Gambian to produce what can be referred to as a literary text. He continued to catalogue Gambian writers, with Lenry Peters (dubbed the father of Gambian literature), Gabriel Roberts, the late Ebou Dibba (May his soul rest in perfect peace), Tijan Sallah, Nana Grey-Johnson, Charles Sarr Thomas, Sheriff Sarr, Swaebou Conateh and Hassoum Ceesay (his senior) featuring high on his list.  Discoursing further, Hassoum explained the role played by the Gambian media in the nurturing and promotion of Gambian literature, citing Ndaanan and the Daily Observer as examples.  In this regard, he noted that his namesake and Swaebou Conateh wrote articles in the former before publishing their literary works in the form of books while Baba Galleh-Jallow wrote prolifically in the latter prior to the publication of his book.  Mr Ceesay proceeded to single out the Observer Company which prints Gambian literary works.<br>" +
                    "<br>" +
                    "Hassoum’s speech can be interpreted as proving the existence of something called ‘Gambian literature’ to which many are oblivious, manifesting his appreciation of works of Gambian writers, recognizing the contribution of the Gambian media towards the  facilitation of the growth and development of Gambian literature and establishing a link between Gambian writers and the Gambian media, thereby bringing them closer.  The two complement each other in that they have much the same aim, for which reason there should be a very cordial rapport between them.  Their co-operation or collaboration can earn them mutual benefit.  For example, a writer can enrich a newspaper and develop himself/herself to metamorphose into an acclaimed writer by writing in the newspaper, as is the case with the aforementioned writers, which is true with Essa Sey and Mariama Khan, both of whom wrote a number of poems in the Daily Observer before publishing their collections of poems as books.  By the same token, a newspaper can, by interviewing writers, reviewing their works or granting them spaces to write articles, enrich itself and thus attract a wider readership while promoting or nurturing the writers, just as airing a drama piece can benefit both the media house and the playwright.  Above all, the public stands to benefit more in the marriage between writers and the media.  Judging by the existence of different literary columns in our newspapers, one can rightly say that the situation is encouraging.  Nonetheless, I hope and pray for closer, continued collaboration. <br>" +
                    "<br>" +
                    "Pierre Gomez<br>" +
                    "Addressing the gathering, the organizer, Pierre Gomez, a lecturer of Gambian literature at the University of The Gambia, who is currently pursuing doctoral studies with Université de Limoges in France, said that the motive behind his initiative was to promote Gambian literature.  According to Mr Gomez, he wanted to sell the idea of setting a day for Gambian literature to be celebrated annually as we did on that memorable day.  Pierre has the conviction that this would give the public the golden opportunity to interact or have direct contact with Gambian writers.  After delivering his moving, engrossing speech, Mr Gomez engaged the writers in lengthy discussions, throwing questions, raising issues and commenting.<br>" +
                    "<br>" +
                    "The question arises now:  Why promote Gambian Literature?  The answer is simple.  Promoting Gambia literature means promoting Gambia culture, broadening the minds of Gambians and developing Gambians intellectually, thereby creating awareness and combating, the malignant, contagious diseases of inferiority complex, credulity and gullibility.  Hence, Pierre’s idea is a dandy one. As a promising young intellectual, endowed with a sharp mind and sound ideas, Pierre Gomez merits every support, encouragement and commendation in his endeavors.  However, I must admit that we the writers did not have it easy with Pierre.  Although Mr Gomez cannot be described as a captious person, one can say that he is so critical.  This, I believe, is ascribable to the fact that he has an extraordinarily enquiring mind.  Thus, escaping his inquisitive students would put you into trouble with him.  Although he would not flay your work, he would grill you to the maximum.  So, the Pierre under discussion is quite different from Pierre the talented dancer mentioned in my pieces ‘A joyous moment at observer’, who would entertain you with his amazing dancing styles.  This one would torment or torture you with his dumbfounding, nonplusing and perplexing questions.  But as I warned you against emulating the way the previous Pierre dances, I caution you against mounting the rostrum to face the current Pierre without having the ability to overcome stage fright and answer questions impromptu.  I am inclined to believe that Pierres have special gifts, wherever they are found.  I hasten to note that I like the styles of both men and admire them both.  Though excruciating, Pierre’s questions were very educative, which is the essence of intellectual discussion.  Besides, his arguments were very congent and healthy demonstrating his intellectual maturity.  Well done, Mr Gomez!<br>" +
                    "<br>" +
                    "Nana Grey-Johnson<br>" +
                    "The president of the Gambia Writers’ Association, Nana Grey- Johnson presented a paper on writing as a means of diffusing information, opining that the writer’s aim should be to create a just society.  Mr. Grey-Johnson laid great emphasis on the importance of information, contending that it is he who has information that controls the world, but not he who has power or military might as many believe.  The Literary giant recounted his experiences, explaining how his newspaper was closed following the publication of his article on the contentious issue of female circumcision which embittered many who drew the simple, hasty conclusion that he had lost his marble, how his huge investment on his works impoverished him and deprived him of luxuries, which the astronomical sums of money he spent to publish his works could allow him to enjoy, and how his loyal, faithful wife stood by him during those trying moments.  However Nana sent us into raptures by disclosing that one of his books, ‘The Magic Calabash’, has gained international recognition and is currently being edited for publication and use in West African Schools as port of their syllabus.  Answering a question from the floor, Mr Grey-Johnson said he maintained his position that Armitage Senior Secondary School should be renamed after Edward Francis Small. He revealed that it was Governor Armitage who banished Edward Francis Small from his own country, The Gambia as a way of suppressing him as a journalist and that the latter continued publishing his newspaper while living in exile in Dakar, neighboring Senegal.  This abundantly shows Small’s firm determination to render services to his people by keeping them informed despite the difficulties he was facing.  To Mr. Grey-Johnson, Small was a national hero and thus deserves more honour in The Gambia than Armitage whom he views as an encroacher and an oppressor.<br>" +
                    "<br>" +
                    "I quite agree with Nana that writers should aim to create a just society, for there cannot be peace and development without a just society.  Just imagine a society characterized by  moral decadence and oppression in the form of drug and sexual abuse, nudism and transvestism, bribery and corruption, embezzlement and misappropriation of funds, victimization, brutalization, fraud, forgery, fudging prevarication, obscurantism, tribalism, nepotism, sectionalism, discrimination, favoritism,..! Everybody is bound to suffer in one way or the other in the long run.<br>" +
                    "<br>" +
                    "In asserting that the world is controlled by those who have information and not those have power, Nana wanted to drive home the point that the pen is one of the most powerful weapons one can think of, if not the most.  This has jogged my memory to the assertion made by the famous Kenyan writer Ngugi Wa Thiongo in his book ‘Pen Point Gun Point’ that the pen is even more powerful than the gun.  To exemplify, the luminary narrated an encounter between an Egyptian prisoner (a writer) and a prison warden.  According Ngugi, the inmate asked for a pen and a piece of paper only to be told by the warden that he would rather give a gun, for he feared the pen of the writer more than the gun.  Hence, the pen, which conveys information and functions persuasively, is more powerful than the gun which is a forceful means.  In other words, the pen, which is synonymous with information in this sense, is more powerful than power itself.<br>" +
                    "<br>" +
                    "Nana’s dedication and commitment manifest his selflessness and altruistic tendencies.  I wish we had more than a million Nanas in our society.<br>" +
                    "<br>" +
                    "I hail Nana’s wife for her kind co-operation and assistance to our dear colleague.  She has really proved the saying ‘Behind every successful man is a woman’.  She is the type of woman every man is looking for.<br>" +
                    "<br>" +
                    "Nana’s eventual success in having one of his books recognized internationally and recommended for use in West African  Schools is a great achiement which shows that anything can be achieved with determination.  Such a laudable achievement is a pride to all Gambians.  We rejoice with Nana and his family.<br>" +
                    "<br>" +
                    "From Nana’s account of Small’s confrontation with Armitage, we can see that the former struggled hard to inform his people whereas the later laboured to deny them information.  Information is a valuable resource that should be made accessible to people.  Leader who means good to the people he rules would not deny them information or endeavor to keep them in the dark as was the case with Governor Armitage.  Hence, Small who risked his life to remove his people from the dark passed as an admirable, honorable person as opposed his persecutor, Governor Armitage.  Therefore, the school should bear Small’s name instead of Armitage’s.  In fact calling the school Armitage is ironical and insulting to our intelligence.<br>" +
                    "<br>" +
                    "Charles Sarr Thomas<br>" +
                    "The veteran civil servant and playwright Charles Sarr Thomas gave a presentation on literature which, according to him is a way of expressing oneself in an artistic way. Mr Thomas dedicated the last part of his presentation to drama, discussing the skills required in this area, drawing examples form his book ‘The Memorandum’. The virtuoso expatiated on characterization, stressing the need for compatibility between characters and their respective roles in a play, the absence of which the message being conveyed may be unfathomable, confusing unintelligible or misleading. Mr Thomas explained how he used fiction to avoid offending people and causing trouble for himself. He disclosed at the end of the lecture that his book will soon be published internationally.<br>" +
                    "<br>" +
                    "Like Charles said, literature is an art, and this is what distinguishes literary writings form other kinds of writing. But one may ask: Why bother to write artistically? Several reasons could be advanced in answering this question. As we all know, art is beautiful. It therefore follows logically that artistic or literary writings are beautiful and hence could have a very great impact as opposed to other types of writing which I call ordinary writings, but not in a derogatory sense.  One can also talk of economy in this regard.  We can economize words in literary writing without necessarily reducing the weight of the text.  For instance, in poetry, one can express quite a lot of ideas in one line or one stanza, which might be difficult or impossible with ordinary writing.  With literary writing, one can easily put his/her message across or criticize without infringing the law, as is the case with satires or lampoons.  Thus, literary writing demands more skills than ordinary writing.<br>" +
                    "<br>" +
                    "As Charles rightly put it, compatibility is so important in characterization.  To understand this, just imagine assigning the role of an adult to a child or vice versa in a play.  It would be gravely flawed.<br>" +
                    "<br>" +
                    "Hence, the presentation was so interesting.  Mr. Thomas took us back to the university lecture room I am enormously enraptured by the news that Mr. Thomas’ book has gained international recognition, though this is not the least surprising to me, judging by the quality of his work.  Congratulations!<br>" +
                    "<br>" +
                    "Mariama Khan<br>" +
                    "Mariama Khan answered questions on her newly published collection of poems.  At the request of the poet, Pierre Gomez read one of the poems entitled ‘Futa Toro’ sonorously in a mellifluous voice like that of a nightingale.  According to the talented poet, that well crafted poem is aimed at demonstrating her love for Futa Toro, the origin of her ancestors, of which she is very proud, despite the fact that she was born and bred in a milieu far from that place.  Asked to explained why she has said in the poem that she dances the dances of Futa Toro, laughs its laughs and smiles its smiles but does not cry its cries, the genius said that she wanted to show how she respects and values some aspects of the culture of her ancestors, adding, ‘but this poem is a work of art and can be interpreted in different ways.’<br>" +
                    "<br>" +
                    "Maria’s poem serves to discourage the feeling of inferiority complex.  One should be proud of what he/she is, for human beings are born equal, made of bones and flesh and have the same destination - the grave, which makes it absolutely foolish to feel that one is inferior or superior to others.  Madam Khan preaches in her poem that being far from home should not cause one to dissociate himself/herself from his/her roots or people.  As Mariama felicitously put it, literary works may be open to interpretation.  That is one beautiful thing about art.  It is thought provoking.  As we all know, culture may have merits and demerits or good and bad aspects.  The ambiguous line in Mariama’s poem could be interpreted as advising people to adhere to good cultural practices and abandon or keep aloof from harmful ones.  What a brilliant idea!  What a beautiful work!<br>" +
                    "<br>" +
                    "<br>" +
                    "Saihou Omar Jallow<br>" +
                    "Speaking on the art of theatre, Saihou Omar Jallow disclosed that his organization aims to promote this art.  Mr. Jallow invited dramatists to submit their works to them for publication.  However, he advised them to work very hard to produce high quality works, saying that the works would be subjected to rigorous evaluation before publication.  Saihou Omar lamented that little has been done in the area of drama and challenged writers to do more in it.  <br>" +
                    "<br>" +
                    "Mr Jallow brought good news for us. The ball is in our court.  This is a golden opportunity we cannot afford to miss.<br>" +
                    "<br>" +
                    "Saihou Omar’s concern regarding the work done thus far in drama is a genuine one.  There are very few playwrights in The Gambia.  As far as I know, the notable Gambian dramatists are the aforementioned, Janet Badjan-Young and Charles Sarr Thomas, and Gabriel Roberts.  This is a very small number, compared to the number of Gambian novelists and poets.  According the Bibliographic Inventory of Dr Jean-Dominique Pénel, 1,336 literary texts have been published in the Daily Observer newspaper between 1992 and 2001, of which there are 979 poems, 347 short stories and 10 drama pieces.  Again, this shows that drama is lagging far behind as far as Gambian literature is concerned.  Therefore, I join Saihou Omar in calling on my fellow writers to give more attention to drama or devote more time to it.  I commend Mr. Jallow for his invitation and noteworthy observation.<br>" +
                    "<br>" +
                    "Saikou S Ceesay<br>" +
                    "Talking about his novel ‘The Golden Days of the Jungle’, Saikou S Ceesay recounted his bitter, disheartening experience which prompted him to write the book.  According to Saikou, a parliamentary secretary at the ministry under which he worked denied him the chance of getting a scholarship to pursue studies abroad by flatly refusing to sign the required documents for him in spite of the fact that he was entitled to the scholarship.  Mr Ceesay went on to explain how he struggled after his ordeal and later occupied a position which allowed him to revenge when his victimizer approached him in his office after losing his job as parliamentary secretary following the 1994 military takeover in The Gambia.  Saikou explained how the animals in the novel live in the jungle, governed by rules, which the bigger animal have laid down to exploit the smaller ones.<br>" +
                    "<br>" +
                    "Although I do not encourage revenge, I would not blame people for taking revenge.  My quarrel is with those senseless, shameless and irresponsible people like that parliamentary secretary who abuse their position or powers to victimize their fellow men whom they are paid to serve.  What a nasty habit! What an unwise act! Whoever you are and whatever position you occupy, you will vacate it sooner or later, dead or alive, whether you like it or not, and whatever act you commit goes on record.  Hence, taking advantage of your position to victimize others can complicate matters for you and your family members and associates who may be innocent of your foolish acts, just as rendering service to them as expected of you can facilitate matters for you after dismounting your position.  After all, what is more unfair and sinful that maltreating the very people you are paid to serve?<br>" +
                    "<br>" +
                    "Saikou’s novel depicts a society dominated by the ilk of that crooked Parliamentary Secretary.  It shows how inequitable or unjust some people are.  That Mr Cessay has used animals as his characters to make such an exposé as a way of eradicating the malpractices of his society shows how conscientious and creative he is.  What a wonderful job!<br>" +
                    "<br>" +
                    "Ebou Gaye<br>" +
                    "Ebou Gaye gave a presentation on his novel ‘Patience Is Accompanied by Smiles’ under the headings: Synopsis, Style, Themes and Aim.  Mr Gaye said that he had used figurative language, proverbs and citations from the Holy Scripture to decorate and enrich his work.  According Ebou, his aim is to educate, inform, enlighten and entertain.  Mr Gaye argued that the frequent use of English, French, Arabic, and Wolof proverbs in his book and the very fact that the title of the book is derived from a Wolof proverb ‘Ku mugne muugne’ refute the claim by some members of the floor that Gambian writers do not use literary devices or figurative language.  Ebou pointed out that he had cracked jokes in the novel so as to entertain and captivate readers.  Answering the question whether his book is an autobiography or not, Mr Gaye said, 'yes, no. The book is a mixture of fiction and nonfiction.  Not all the things that apply to the hero apply to me.  For example, the hero travelled to France to pursue studies and I have never.  He has been appointed ambassador and I have never.  But I have used my experiences and places through which I have passed in setting up the novel.  And even where I have used my experiences, there are additions and deletions.' <br>" +
                    "<br>" +
                    "I have reserve my comments here but do not ask me why.  A bar of soap would not wash itself, goes the proverb.<br>" +
                    "<br>" +
                    "Bala Saho<br>" +
                    "Bala Saho answered questions on one of his books ‘The Road To My Village' Mr Saho cautioned those ambitious to go to the West to look for greener pastures that they should expect some difficulties in as much as they expect benefits.  According Bala, he has used his experiences in Europe to sensitize those youths infected with the 'nerve syndrome'.  'I am not saying they should not go.  They can go but they should know that things are not always easy there as one may think.  There are so many problems there,' said the novelist.<br>" +
                    "<br>" +
                    "Put in crude terms, Mr Saho was saying that it is not all roses in the West as many people erroneously believe and that one should weigh things carefully or prepare very well before setting out for the West to look for greener pastures.  Given the way some people risk their lives to go to the West, the way people are duped in their attempts to get there and the problems some encounter there, it is good to have an idea of what is happening there.  So, Bala’s novel is timely.  Well done, Mr. Saho!<br>" +
                    "<br>" +
                    "Now, I would like to seize this opportunity to wish our brothers and sister in the West well and urge them not to forget home, as there is no place like home.  As for the aspirants, I wish them good luck in their endeavors and exhort them to pay heed to Bala’s advice.<br>" +
                    "<br>" +
                    "<br>" +
                    "Musa Jallow<br>" +
                    "Answering question on his novel, ‘Across the Scene’, the secretary general of The Gambian Writers’ Association, Musa Jallow explained how he had used fiction to sensitize people on drug abuse.<br>" +
                    "<br>" +
                    "Given the scourge and menace of drug abuse, which is rampant in our society, Musa’s work is pertinent, one can rightly say.  I believe the book can go quite a long way in mitigating or attenuating the devastating, detrimental effects of drug abuse, or ridding our society of the plague.  Thus, Musa Jallow has done an excellent job as a moralist.<br>" +
                    "<br>" +
                    "Bampha Omar Jaiteh<br>" +
                    "Bampha Omar Jaiteh read poems from his collection which is ready for publication.  Mr. Jaieth has dedicated a skillfully crafted poem to our women folk in recognition of their importance.<br>" +
                    "<br>" +
                    "Women are our partners, and we cannot do without them.  Therefore, we should encourage them by commending them for their pivotal role as Mr. Jaiteh has done, as well as caring for them, empowering them and according them the opportunity to utilize their knowledge and talents.  I thank Bampha Omar for a job well done and wish him success in his endeavours to have his valuable work published. <br>" +
                    "<br>" +
                    "Ebrima NK Jarju<br>" +
                    "As an enthusiastic writer, Ebrima NK Jarju has done a lot of work in the areas of mathematics and poetry.  He recounted how he struggled to have his works published but without avail.  What a pity! <br>" +
                    "<br>" +
                    "That Mr. Jarju has produced works in distinct branches of knowledge speaks volumes for his versatility, as his earnest efforts to publish his works demonstrate his dedication and determination. Judging by the poems he read for us, one can say that Ebrima has very high potentials as a writer.  He is cut out to be a writer. I would not hesitate to say that.  I wish Mr Jarju all the best and urge him to remain undaunted and keep on the struggle.<br>" +
                    "<br>" +
                    "The discussions continued for sometime after the presentations, with university students opining that the Department of State for Education should consider using the works of Gambian writers in our school syllabus as a way of encouraging them and promoting Gambian Literature.<br>" +
                    "<br>" +
                    "Notable among the contributors were Cherno Omar Barry, a PhD student at Université de Limoges and a lecturer at the University of The Gambia, Ensa Touray, Bisanty Gomez, Sheikh Jallow and Landing Bojang.<br>" +
                    "<br>" +
                    "The occasion was chaired by Musa Jallow and Saikou S Cessay while James Gomez delivered the vote of thanks.  It is worthy to note that Pierre Gomez and Dr Jean- Dominique Pénel, a French lecturer at the University of The Gambia and Gambia College were commended highly for their role in the promoting of Gambian literature.  Keep it up, Messrs!   </font>  <br>"
            ,
            "<font color=\"black\"><b>Lawyers/Judges, Politicians and Writers/Journalists: Good Servants or Bad Masters?</b><br>" +
                    "<br>" +
                    "Although many people regard lawyers/judges, politicians and writers/journalists as good, indispensable members of society, the misconduct of some of them makes many people wonder as to whether they are really good servants or bad masters. Others even hold the view that they do more harm than good and hence see them as enemies or undesirable elements.<br>" +
                    "<br>" +
                    "A debater expressed his vantage points on the issue as follows: I don’t want my children to take interest in law, politics, writing and journalism. Lawyers and judges manipulate the law to suit the interest of their clients or their bosses to the detriment of other parties, regardless of whether the former are right or wrong. Politicians hoodwink people and cause hatred and division. They put their interest above that of the general public whose interest they claim to serve, and would not mind offending or oppressing others in their attempts to defend their interest or achieve their lofty goals. Writers and journalists are negative and subjective. They are engaged in character assassination, vilifying their perceived enemies and maligning innocent people with whom they have no scores to settle. They file reports based on rumours. They create rancour and trigger or fuel conflicts by employing sensational methods in their works.<br>" +
                    "<br>" +
                    "I would not hesitate to vociferate that I totally disagree with this blanket, outright condemnation, as I judge it utterly illogical. Although I am not oblivious to the fact that there are some elements of truth in the above statements, I know fully well that not everyone involved in the aforementioned occupations is bad as implied in them. There are good and bad practitioners in every profession. Do we say that all teachers are bad because of the detestable deeds of those teachers who shamelessly sleep with their students in exchange for exam marks or grades? Emphatically no! Should we conclude that all doctors are bad based on the deplorable acts of those private doctors who inject patients with empty syringes? Categorically no! Is it logical to say that no-one should train as a teacher or a doctor judging by the abhorrent behaviour of those devious, errant teachers and doctors? Certainly not! Likewise, we should not say that no-one should be allowed to get involved in the occupations mentioned above by virtue of the fact that some people practise them with dishonesty and despicability. In fact, those occupations are important like other professions deemed noble by many in society. <br>" +
                    "Lawyers fight for justice and defend human and people’s rights in general. Some lawyers at times represent people free of charge. It is common knowledge that some judges and magistrates dispense justice independently without fear or favour, affection or ill-will. These incontrovertible, irrefutable facts disprove the assertion that legal practitioners are collectively bad. Where there are laws, there must be lawyers, and no lawyers are needed where there are no laws. So, to say that no-one should practise law is tantamount to saying that there shouldn’t be laws. Can you imagine a county where there are no laws or where justice and respect for rights don’t prevail? That situation can be likened to jungle life. However, the practice of law becomes bad if legal practitioners fail to adhere to the teachings of the following Hadith (saying of Prophet Muhammad- peace be upon him): “Judges are of three categories. Two will go to hell and one will enter paradise. One who practises as a judge without being fully conversant with the law or without knowing the truth well will go to hell; one who has thorough knowledge of the law or the truth but deliberately manipulates it will go to hell; and one who is well acquainted with the law or the truth and judges by it will enter paradise.” Although the above Hadith makes mention of only judges, it encompasses all legal practitioners, as it serves as a guiding-light to them all. However, many lawyers and judges in this modern generation of ours fail to take it into account. Their behaviour leaves too much to be desired and hence leads many to cast doubt on the morality of their profession and cherish the illusion that they are all sell-outs who are always ready to manipulate the law or distort facts for material gain. Although I am fully cognizant of the importance of legal practitioners in general and admire many of them, I believe the behaviour of some- particularly those working with dictators- should not go unchecked.   <br>" +
                    "<br>" +
                    "Politicians manage the affairs of a nation. Every citizen has a stake in the running of the affairs of his or her country. Politics is everybody’s business because the decisions made by politicians affect every citizen directly or indirectly.  A country without political leaders is comparable to a ship without a crew. It is in recognition of this vital role of politicians that our venerable prophet (peace be upon him) said that any one who dies without pledging allegiance (to a leader of his choice) has died like an ignoramus.   Nevertheless, it should be pointed out that politics could prove to be an extremely dirty game if practised for the sole purpose of self-enrichment or self-aggrandizement as is the case in many African or Third World countries where rapacious, egocentric leaders metamorphose into brutal dictators who sadistically rule with iron fists while plundering and squandering the resources of their countries, refusing to relinquish power peacefully. According to the Islamic point of view, a political leader of this sort- one who imposes himself on people- is cursed by God. Such unscrupulous politicians soil the political terrain and thus cause many to detest politics in general. Woe betides them if they continue in their filthy game! <br>" +
                    "<br>" +
                    "Writers and journalists inform, educate, enlighten and entertain. They serve as watchdogs and the voice of the voiceless and the downtrodden. This is why the press is referred to as the fourth estate, coming after the executive, the legislature and the judiciary of a state. A country without writers and journalists is kept in total darkness. That situation is unliveable, to say the least. Although one may get rich or become famous through writing and journalism, the ultimate goal of a writer a journalist should be to render services by righting wrongs or promoting peace and justice.  A writer or a journalist who aspires after riches or fame inevitably abuses the power of the pen or the keyboard intentionally or inadvertently, thereby marring rather than making, wreaking havoc and jeopardizing precious lives in the process. Writers and journalists should aim to create a just society where decency prevails, for there cannot be peace and development without a just society. They should refrain from taking advantage of their platform or the might of the pen to oppress the defenceless. Otherwise, they deceive the purpose of their occupation and thus become easy preys in society and, above all, incur the wrath of God who has stated unequivocally and explicitly in the Glorious Qur’an that He loathes oppressors, warning them of the harsh punishment that awaits them as a result of their misdeeds.  <br>" +
                    "<br>" +
                    "From the foregoing analysis, it can be concluded that lawyers/judges, politicians and writers/journalists could be good servants just as they could be bad masters, depending on the perspective from which the matter is viewed. We can also draw a conclusion that no society can do without them. They are indispensable, though they could occasionally be a menace or a nuisance as contended by the debater mentioned earlier in the discourse. What qualifies them as good or bad is their behaviour, not necessarily their professions as many people erroneously believe. <br>" +
                    "<br>" +
                    "Therefore, people should be allowed to practise any profession or get involved in any occupation of their choosing to serve others and earn their living in a decent manner. What is important is that they work industriously to acquire the knowledge and skills required in their chosen careers and execute their duties in conformity with the ethics and codes of conduct of their professions. Whatever they choose to do, they should endeavour to do it with proficiency, efficiency, honesty and sincerity.</font> <br>"
            ,
            "<font color=\"black\"><b>I Am Gambian Too</b><br>" +
                    "<br>" +
                    "Confession I must commence with<br>" +
                    "I am no poet like you and giant poet Essa the orator<br>" +
                    "I am more comfortable with prose <br>" +
                    "But cannot help trying my hand at poetry today <br>" +
                    "In appreciation of your invaluable, meritorious services to humanity<br>" +
                    "After poring over your well crafted, engrossing, gripping poem on maafanta<br>" +
                    "You are superb indeed  <br>" +
                    "I am Gambian too<br>" +
                    "<br>" +
                    "Eloquent, brilliant, serviceable, selfless, decorous, courageous, patriotic lady<br>" +
                    "I concur with you<br>" +
                    "As you are entirely right<br>" +
                    "You are evidently a sage<br>" +
                    "I am Gambian too<br>" +
                    "<br>" +
                    "I hail you for being contented with your natural beauty as African<br>" +
                    "Unlike those who use bleach to shed their skins<br>" +
                    " Those who put animal hair on their heads<br>" +
                    "Those who wear expensive jewels <br>" +
                    "In the name of beautification<br>" +
                    "Disregarding the negative ramifications of such practices<br>" +
                    "You are a true moralist<br>" +
                    "I am Gambian too<br>" +
                    "<br>" +
                    "I extol your cogent argument on education and the degree syndrome<br>" +
                    "Not all those with high level of education pass as intellectuals<br>" +
                    "Not all those with degrees are sound or productive<br>" +
                    "As not all that glitters is gold<br>" +
                    "Education is useless in the absence of principles and good manners<br>" +
                    "You are a real educator<br>" +
                    "I am Gambian too<br>" +
                    "<br>" +
                    "Your condemnation of cowardice, hypocrisy and dictatorship is commendable<br>" +
                    "Cowards, hypocrites and dictators should vanish<br>" +
                    "They are undesirable elements of society <br>" +
                    "They should be filtered out like germs in water<br>" +
                    "As they are a catalyst for catastrophes and calamities<br>" +
                    "You are indisputably a lioness<br>" +
                    "I am Gambian too<br>" +
                    "<br>" +
                    "Keep it up, my dear!<br>" +
                    "You are worthy of emulation<br>" +
                    "I exhort every man and woman to borrow a leaf from your book<br>" +
                    "I wish we had thousands like you<br>" +
                    "You are a precious asset and a source of pride <br>" +
                    "I am Gambian too </font><br>" +
                    "<br>"
            ,
            "<font color=\"black\"><b>Isn’t that ironic?</b><br>" +
                    "<br>" +
                    "Isn’t that ironic?<br>" +
                    "You habitually blame the West for violating human rights in foreign countries,<br>" +
                    "Calling them all sorts of names<br>" +
                    "You recently claimed that your human rights record is far better than that of the US and the UK put together<br>" +
                    "Yet, people always suffer from torture, go missing or get killed under your watch <br>" +
                    "Is it logical for you to lambast Westerners for maltreating others while shamelessly brutalizing and butchering your compatriots?<br>" +
                    "Is this not a case of advising others to take bath while wallowing in the mud?<br>" +
                    "Do you care more about the wellbeing of those whose rights you defend than that of your people? <br>" +
                    "Are you telling us that they are superior to your compatriots and deserve better treatment than them?<br>" +
                    "Do you think you can justify mistreating your own people by accusing the West of human rights violations on foreign lands?<br>" +
                    "Do the wrongs or the misdeeds of the West give you the licence to inflict suffering on your compatriots or slaughter them like animals? <br>" +
                    "<br>" +
                    "Isn’t that ironic?<br>" +
                    "You have sworn by the Holy Qur’an to serve your people without fear of favour, affection or ill-will,<br>" +
                    "And always tell your compatriots that you would not compromise their security,<br>" +
                    "Claiming that you are ready to die for them<br>" +
                    "Yet, you clearly manifest your utter reluctance to investigate cases of assassination and disappearance of your compatriots under suspicious, mysterious circumstances,<br>" +
                    "And fly into a rage when reminded to take necessary action,<br>" +
                    "Coming up with absurd, preposterous, lame, implausible, untenable and unconvincing arguments,<br>" +
                    "Making infantile, silly, opprobrious, taunting, sarcastic and provocative remarks in your desperate, futile attempts to cover up or exculpate yourself, <br>" +
                    "Thereby arousing more suspicion<br>" +
                    "Yet, you are always eager to order an investigation in matters affecting your security and punish culprits or suspects without hesitation <br>" +
                    "Haven’t you reneged on your obligation, oath and promise to protect your people?<br>" +
                    "Are you not more interested in your personal security than that of your compatriots?<br>" +
                    "Don’t you believe in the holiness of the Holy Qur’an?<br>" +
                    "Do you think you can outwit or outsmart God? <br>" +
                    "<br>" +
                    "Isn’t that ironic?<br>" +
                    "You claim to have discovered a cure for all ailments,<br>" +
                    "Including HIV/AIDS, <br>" +
                    "Offering to cure patients free of charge,<br>" +
                    "And boast of having provided your country with state-of-the-art health facilities and good medical experts<br>" +
                    "Your wife has initiated an operation dubbed Operation Save a Baby,<br>" +
                    "And provided our main referral hospital with incubators  <br>" +
                    "Yet, you travel and send your family members abroad for medical treatment,<br>" +
                    "In countries you call enemies of Africa,<br>" +
                    "And your wife always goes there to deliver babies<br>" +
                    "Can’t you cure yourself and your family members? <br>" +
                    "Why deny yourself and your family members your services?<br>" +
                    "Why not advise your wife to save her babies by delivering them at home?<br>" +
                    "Don’t you trust your health facilities and medical experts?<br>" +
                    "Do you consider it wise, reasonable or advisable to seek medical treatment from your enemies or have your babies delivered in their countries? <br>" +
                    "<br>" +
                    "Isn’t that ironic?<br>" +
                    "You pretend to be brave and possess supernatural powers<br>" +
                    "Yet, you use the meagre resources of your country to purchase and pile up heavy weapons,<br>" +
                    "Build bunkers and tunnels to be used as hideouts and escape routes in case of emergency,<br>" +
                    "Buy the loyalty of armed and security forces with incentives,<br>" +
                    "Surround yourself with guards armed to the teeth all the time,<br>" +
                    "Order your army to be on the alert to avert invasion or repel attack,<br>" +
                    "And hire soothsayers for security reasons<br>" +
                    "Why all these precautionary measures?<br>" +
                    "Why do you need tight security?<br>" +
                    "Why do you need the services of soothsayers?<br>" +
                    "Why didn’t you use your magical powers to tackle the protestors who caged you in a hotel in the US?<br>" +
                    "Can’t you give your demons instructions to crush those who bear malice or grudge against you?<br>" +
                    "Can’t you cast a spell on those who try to undermine you or frustrate your efforts?<br>" +
                    "Can’t you simply disappear when faced with danger?<br>" +
                    " <br>" +
                    "Isn’t that ironic?<br>" +
                    "You portray yourself as a devoted Muslim and an espouser of the cause of Islam,<br>" +
                    "By using the Islamic titles Sheikh and Nasiru Deen,<br>" +
                    "Carrying “prayer” beads and what you and your sycophants claim to be a copy of the Holy Qur’an,<br>" +
                    "And sponsoring Islamic activities <br>" +
                    "Yet, you organize wrestling contests for women and beauty pageants for schoolgirls,<br>" +
                    "Claiming that you want to promote culture and girls’ education, <br>" +
                    "By dishing out money and awarding scholarships to winners,<br>" +
                    "And hire women to dance erotically for you<br>" +
                    "Do you think such acts are in line with the teachings of Islam?<br>" +
                    "Why subject women to such a demeaning, debasing, degrading and dehumanizing treatment?<br>" +
                    "Why not use interviews and the academic records of schoolgirls to determine eligibility for scholarships?<br>" +
                    "Do you want to tell us that academic potential is governed by beauty?<br>" +
                    "Are you genuinely interested in promoting culture and girls’ education by organizing such competitions?<br>" +
                    "Are wrestling contests, beauty pageants and erotic dance the best means of promoting culture and girls’ education?<br>" +
                    "Why are you keenly interested in erotic dance as a “pious Muslim”?<br>" +
                    "<br>" +
                    "Evidently, you are a shady, dubitable character<br>" +
                    "Who can you convince with all these contradictions?<br>" +
                    "Only the gullible!<br>" +
                    "Who do you expect to take you seriously with this hypocrisy?<br>" +
                    "Only the naïve!<br>" +
                    "Who can believe you with your quadruple standards?<br>" +
                    "Only a credulous fool!<br>" +
                    "Who would attempt to shield you from criticism or discourage your critics?<br>" +
                    "Only a hypocrite, a prevaricator, an obscurantist, an ignoramus, or an opportunist!</font><br>"
            ,
            "<font color=\"black\"><b>Justice: The Key to Global Peace and Security</b><br>" +
                    "<br>" +
                    "Despite the thunderous, reverberating clamour for global peace and security, the world continues to be plagued by terrorist attacks, political turmoil, civil unrest, popular uprising, riots and the like.  The question arises now: How can we achieve the noble goal of guaranteeing world peace and security, given the fact that people are growing more and more greedy and selfish, which prompts them to behave anyhow? Well, it is an arduous task, I must confess. However, I note in haste that the problem is not insurmountable. Since we cannot enjoy veritable and durable peace and security in the absence of justice, we can resolve the problem only by promoting justice to make sure that it prevails. But one may ask again: How can we ensure the prevalence of justice? This is the duty of all and sundry, particularly politicians, religious leaders and journalists who are among the most influential members of society, if not the most. <br>" +
                    "<br>" +
                    "The aforementioned nemeses are a cause for great concern as they affect people all over the world, directly or indirectly. At this juncture, I would like to single out and dilate on terrorism which receives so much media coverage and attracts rapt attention globally.  <br>" +
                    "<br>" +
                    "I am in accord with the call to combat terrorism but would like to caution that the issue is being blown out of proportion in some quarters for ulterior motives. As former UN Secretary General Kofi Annan aptly put it in an interview, some world leaders capitalize on the issue to curb dissent or eliminate their opponents and perceived enemies. I would add that some rogue leaders in Third World countries use it to please Western leaders in order to gain their favour. This has led to a situation where anybody can be branded as a terrorist anywhere and anytime. The line between terrorists and non-terrorists has become too blurred and indistinct. Some of those who claim to be fighting terrorism are bigger terrorists than the people they label as terrorists. It is not only ironical but also nauseating to hear an infamous rebel leader (warlord-turned-president) call people terrorists, offering to help in the crusade against terrorism. Equally disgusting is the fact that some world leaders who terrorize their own compatriots to suppress them lack the scruples but have the guts to castigate other people, branding them as terrorists. This is a case of the chimpanzee describing the baboon as ‘ugly’. Those leaders who brutalize their subjects as a way of tightening their grip on power while portraying themselves as peace-lovers are terrorists in disguise. Pure and simple! Whatever form terrorism takes, and whatever motive those involved in it have, terrorism is not the best way to solve a problem. I have the conviction that it is the most irrational option. If you use terrorism as a retaliatory means, you end up killing, harming or offending innocent people and thus become culpable, like your enemies or oppressors. If you suppress your people by terrorizing them, be sure that you are inviting trouble, for repression can give rise to a rebellion, civil unrest, popular uprising or political turmoil and your eventual downfall and disgrace, just as we have seen recently. Beware! Terrorism does more harm than good, if at all there is any good associated with it. Abhor it!  <br>" +
                    "<br>" +
                    "Let me now discuss the issue of promoting justice raised earlier and lay it to rest. Political leaders should be more considerate and attentive to the needs and sufferings of the masses whose interest they rightly or wrongly claim to have at heart and serve. They should treat people equally, shunning the practice of favouritism, nepotism and sectionalism which breeds grudge, disgruntlement, hatred and enmity. They should bear in mind that their   misbehaviour and blunders can spell doom or disaster for them in particular and people in general. Where there is a problem, they should admit it and take remedial measures with immediate effect, rather than trying to obscure the facts or shift the blame onto others by using them as scapegoats to camouflage the situation. They should always consult those who know or seek their opinions on matters of national interest instead of making rash decisions and mystifying themselves by behaving as charlatans, trying to give the impression that they know everything, possess supernatural powers and are invincible.  Whatever picture of themselves they and their flatterers want to depict, the fact remains that they are mere mortals with limited knowledge and power. As simple as that! It is worth noting that rather than impressing or convincing people, one exposes his ignorance, folly, cowardice, paranoia and vulnerability by pretending to be all-knowing or superhuman. Problems should not be exaggerated or invented to discredit political rivals for selfish gains. Instead of trying to cling onto power at all cost, as if they are indispensable- which is far from being the case- political leaders should be willing to relinquish power smoothly and peacefully to pave the way for new blood. Tolerance, compassion and mercy should be used as guiding principles. Bullying one’s own compatriots or weaker nations should be avoided as much as possible.<br>" +
                    "<br>" +
                    "It is the duty of religious leaders to preach justice in society   and guide political leaders. Our venerable prophet (may peace be upon him) said in this regard: “The best jihad (fight in the cause of God) is to tell the truth while sitting with a tyrant.” Of course, it is good to extol the good deeds of a political leader to encourage him but praising or flattering him all the time could be misleading. It is a well known fact that some world leaders lack affability and are too haughty and vainglorious to accept mistakes or take advice. If religious leaders don’t have the required wisdom or courage to call such arrogant, contemptuous, disdainful, praise-loving, self-praising and misguided leaders to order   or tell them the truth when they go wrong, they should- at least- refrain from eulogizing or praising them. Otherwise, they are seen as sycophants, puppets, accomplices or unpatriotic citizens who are insensitive to the problems of others, and rightly so. No work, act or deed is meaningful if it is paired with oppression or violation of human rights- injustice. Therefore, it is illogical, shameful and sinful for religious leaders to cultivate the habit of praising a political leader knowing fully well that his bad deeds outweigh his good deeds by far.<br>" +
                    " <br>" +
                    "Journalists act as watchdogs of society besides rendering other invaluable, meritorious services to humanity. Since wrong-doers do not want their misdeeds to be exposed, the activities of investigative journalists could serve as deterrence. Thus, journalists can help promote justice and fair play in society by conducting thorough research and reporting their findings without fear or favour, affection or ill-will.</font><br>" +
                    "<br>"
            ,
            "<font color=\"black\"><b>The Dictator’s Remarks: What A Malicious Intention!</b><br>" +
                    "<br>" +
                    "What a malicious intention!<br>" +
                    "The remarks you made at a rally in Brikama contained in a video aired recently on Fatu Radio are a cause for great concern<br>" +
                    "They strongly suggest that you have a malicious intention vis-à-vis the opposition, <br>" +
                    "And have proven your bigotry, intolerance, folly and wickedness beyond any shadow of doubt<br>" +
                    "You caricatured and satirized the members of the opposition,<br>" +
                    "Describing them as skinny people with bony cheeks,<br>" +
                    "Saying that they are tired and fagged out<br>" +
                    "You went further and stated in plain language that some of them have died,<br>" +
                    "And that some will not live to witness the next elections,<br>" +
                    "As they will die like their colleagues who have already died<br>" +
                    "Your remarks run counter to common sense and the Islamic principle of qutwa hasana according to which a leader is supposed to serve as a role model by leading by example<br>" +
                    "If your loyalists and Islamic scholars are honest and sincere as they want to make us believe, they should do a favour to you and your compatriots by pointing out to you this fact and the dangers associated with your reckless remarks <br>" +
                    "<br>" +
                    "What a malicious intention!<br>" +
                    "Your description of the opposition members doesn’t tell well of you<br>" +
                    "It is childish, infantile, immature and ironic<br>" +
                    "It has amply demonstrated your scorn and contempt of your compatriots,<br>" +
                    "And jogged people’s memories to your appearance when you just came to power<br>" +
                    "As your chief spin doctor has portrayed you in his book Coup d’Etat by the Gambia National Army,<br>" +
                    "You were not the least presentable at the time <br>" +
                    "You looked rough and malnourished,<br>" +
                    "As evidenced by your dry, cracked lips and dehydrated cheeks<br>" +
                    "It is disgusting, nauseating, heart-breaking, outrageous and vexatious that you look down on and mock your compatriots, <br>" +
                    "Putting them in the situation in which you were as a destitute, impecunious soldier- as poor as a church mouse, <br>" +
                    "After you have fattened your flattened lips and cheeks with ill-gotten wealth from state coffers and dirty deals,<br>" +
                    "And become so pompous, conceited, cheeky, insolent and mischievous<br>" +
                    "<br>" +
                    "What a malicious intention!<br>" +
                    "Your death threats are very revealing and provocative<br>" +
                    "They shouldn’t be taken lightly,<br>" +
                    "Given the numerous unresolved cases of mysterious, suspicious accident, death and disappearance of some of your opponents and perceived enemies <br>" +
                    "They have rendered irrefutable the allegation that you have hands in such cases<br>" +
                    "Your threats should be taken as a statement of intent <br>" +
                    "My interpretation is that you are ready to liquidate some opposition members before the elections,<br>" +
                    "And that you don’t care about the security of your compatriots and the oath you have taken to serve their interest without ill-will<br>" +
                    "Only a cruel, crooked and misguided person like you has the audacity to defend or play down your threats, or try to give them a positive interpretation   <br>" +
                    "I defy your blind, brainwashed apologists and your chief spin doctor to interpret your threats for the public if they have an interpretation different from mine<br>" +
                    "Killing people is not pride,<br>" +
                    "Nor is it fun as you consider it to be  <br>" +
                    "Life is precious and hence should be protected rather than being cut short deliberately and unjustifiably <br>" +
                    "Only a short-sighted, narrow-minded person brags of having licence or powers to kill people and get away with it<br>" +
                    "You can’t escape death, no matter how many people you kill  <br>" +
                    "Like all your compatriots, you have dead relatives and loved ones that you can’t reincarnate or bring back to life,<br>" +
                    " And you will certainly die one day and join them on the land of see-me-no-more,<br>" +
                    "After incurring the wrath of God the Omnipotent as a result of your brutality<br>" +
                    "It is therefore irresponsible, irrational and silly for you to issue death threats or kill people for worldly desires<br>" +
                    "<br>" +
                    "What a malicious intention!<br>" +
                    "You have once again manifested your egocentricity, selfishness and insatiable appetite for power, <br>" +
                    "And your undemocratic, unpatriotic tendencies<br>" +
                    "You and your hypnotized supporters always denounce attempts to change your regime through violent means,<br>" +
                    "Contending that those who want to replace you should try to do so through the ballot box,<br>" +
                    "Despite the fact that you came to power through violent means by staging a coup and deposing a democratically elected president<br>" +
                    "You are now telling us that you are willing to use violence to suppress or eliminate those who want to replace you through peaceful means,<br>" +
                    "As you can’t accept smooth change of power and can’t imagine anybody occupying the seat of power while are still alive and kicking,<br>" +
                    "And hence want to see your country set ablaze and burn to ashes in case of regime change<br>" +
                    "What a wicked wish! <br>" +
                    "You are clearly and indisputably inciting and instigating violence by refusing and ruling out peaceful change of government in your country,<br>" +
                    "As it is said that if you make peaceful change impossible, you make violent change inevitable<br>" +
                    " Only a gullible person and a credulous fool can be convinced with your claim that you love your country and wish your people well<br>" +
                    "<br>" +
                    "What a malicious intention!<br>" +
                    "You behave as if you are an indispensible leader,<br>" +
                    " And that your departure from power will spell doom for your country and compatriots<br>" +
                    "That is insulting to the intelligence of Allah the Almighty and that of your compatriots<br>" +
                    "Allah is All-knowing, All-wise <br>" +
                    "He wouldn’t endow only one person in a whole country with leadership qualities or capabilities,<br>" +
                    " As no one is immortal and can lead forever<br>" +
                    "  After all, you are not a special breed<br>" +
                    "Your track record before you mounted power and your tenure of office as a head of state has shown clearly that you are not more capable of leading than your compatriots<br>" +
                    "In fact, you can be counted among those with the least capabilities to lead<br>" +
                    "You were notorious for indiscipline and bullying of innocent people as a gendarme officer and a soldier,<br>" +
                    "As substantiated by the testimonies of your former Senegalese gendarme boss in his book Pour l’Honneur de la Gendarmerie Sénégalaise (volume 1) and your former colleagues in the Gambia Gendarmerie <br>" +
                    "Besides, you have proven to be a menace and a nuisance as a leader<br>" +
                    "Before you came to power, you never achieved anything extraordinary in terms of studies and work that your compatriots couldn’t achieve,<br>" +
                    "And your ascension to power has greatly increased your indiscipline and your love of bullying people which you have taken as a hobby <br>" +
                    "You seize the God-given rights of your compatriots,<br>" +
                    " And deprive them of their basic needs, <br>" +
                    "Thereby transforming them into paupers and beggars who work for you like slaves and sing your praises for the crumbs you throw them and the privileges you give them<br>" +
                    "You always threaten, victimize, terrorize, traumatize and brutalize your compatriots,<br>" +
                    "Inflict excruciating, unendurable torment and sufferings on them,<br>" +
                    "And add insult to injury by plundering and squandering their meagre resources<br>" +
                    "Hence, the vast majority of your compatriots will breathe a sigh of relief when your eventual departure is announced, <br>" +
                    " And shout “Good riddance!” at the top of their voices </font><br>" +
                    "<br>"
            ,
            "<font color=\"black\"><b>Dida, Michael, Baba, John: Meddlers or Helpers?</b><br>" +
                    "I have, on several occasions, seen or heard Gambians condemn Dida Halaki, Michael Scales, Baba Aidara (Hydara) and John Aycoth as intruders poking their noses into Gambian affairs. Those Gambians who disapprove of the activities of the quartet contend that they should simply keep aloof from Gambian affairs by virtue of the fact that they are non-Gambians. Some Gambians go to the extent of branding them as provokers, instigators and inciters who abuse Gambian hospitality, opining that their acts should not go unchecked. Others interpret their acts as mockery and insulting to the intelligence of Gambians. On the other hand, some Gambians view them as foreigners who have the interest of Gambians at heart and are thus concerned about issues affecting them. This camp has the conviction that the aforementioned four should be welcomed heartily, encouraged and lauded, rather than being castigated or scared away. In a nutshell, the debate is getting more and more heated- hence my resolve to take pains to express my vantage point in it. <br>" +
                    "The debate reposes in the following question: Are these non-Gambians meddlers or helpers? Well, it is not easy to give a clear-cut, precise or straightforward answer to the above question, I must admit. Thus, I would like to scrutinise the involvement of the four gentlemen in Gambian affairs and their connections with The Gambia in my attempt to furnish an appropriate answer. <br>" +
                    "Dida Halaki<br>" +
                    "Dida Halaki is a British national of African (Ethiopian) origin. He is married to a Gambian lady, with whom he has been blessed with children. Dida has adopted the surname Jallow, which is very common in The Gambia and other African countries such as Senegal, Guinea Conakry, Guinea Bissau and Sierra Leone. Dida owns/used to own a property in The Gambia. He once doubled as Managing-Director and Editor-in-Chief of the Daily Observer newspaper of The Gambia. Prior to that, Dida spent some time teaching in The Gambia. He has commented a lot and continues to comment on Gambian and African issues in newspapers- both print and online. Judging by his connection with our motherland and immense contribution in the areas of education and journalism in The Gambia, I think Dida can be given the benefit of the doubt as a well-wisher. Although he is a non-Gambian, he has a stake in the running of the affairs of The Gambia. His contribution in the above-mention fields is laudable, as their importance cannot be over-emphasized. Educators mould the character of children who are the future leaders, besides imparting knowledge to them. The press is referred to as the fourth estate owing to its incontrovertible importance to society. Hence, I suggest that we welcome our in-law Uncle Dida with open arms and challenge his ideas or views in a constructive manner when they run counter to ours.<br>" +
                    "<br>" +
                    "Michael Scales<br>" +
                    "Michael Scale is a White-British, married to a Nigerian princess. He used to visit The Gambia frequently, making donations there. He has written numerous letters to the UK authorities requesting them to address issues pertaining to the Gambia Government and Gambian nationals. Additionally, Michael supports Gambian online newspapers/radios, particularly Freedom Newspaper/Radio which has grown so popular over the past few years as a source of breaking news and information, and a forum for Gambians and friends of The Gambia. He comments on Gambian issues in particular and African ones as a whole. Thus, Michael has proven to be keenly interested in Gambian affairs and very much willing to help Gambians by championing their cause, for which reason we owe him gratitude. Therefore, Michael can be accepted in our platforms and engaged amicably in debates when the need arises. I guess we have more to gain than to lose in so doing.<br>" +
                    "<br>" +
                    "Baba Aidara (Hydara)<br>" +
                    "Baba Aidara (Hydara) is a Senegalese currently residing in the US. He is the founding-father of Hellogambia Newspaper/Radio which has attracted quite a large readership/audience within a year. Baba reproduces articles on Gambian affairs from different sources and allows Gambians from both sides of the political divide (ruling party and opposition sympathizers) to freely express their views or exchange ideas using his online newspaper/radio. Hence, he has provided a very good platform for Gambians- a platform that is inconceivable in The Gambia today. As we all know, Senegal and The Gambia have blood, religious and cultural ties- among others, in addition to being neighbours. Based on this undeniable fact, it can rightly be stated that every Senegalese and every Gambian has a stake in the running of the affairs of the two countries, regardless of his/her nationality. Therefore, I regard Baba as a brother and a helper who is genuinely interested in Gambian affairs- far from being an intruder or a meddler. I think he should be commended highly for a job well done and supported in any way possible, or at least encouraged. Superfluous to say, helping him means helping ourselves as Gambians. Nevertheless, he should charitably be called to order when he goes wrong, as this will help guide him on the right path.<br>" +
                    "<br>" +
                    "John Aycoth<br>" +
                    "A White-American, John Aycoth has reportedly served the Gambia Government as a lobbyist. He at times gives exclusive interviews or holds talks and answers questions on Freedom Radio. Listening to John   on Freedom Radio or reading the transcription of his interviews on Freedom Newspaper online, one can draw a conclusion that the man has an arsenal of vital information on our current government and president. Discussing with him may prove to be worthwhile, as information is power. I therefore urge my compatriots to listen to him with rapt attention and keen interest, digest his words and tackle him with civility if need be, rather than treating him with suspicion or denouncing him outright- lest we lose the valuable information he has in his possession.<br>" +
                    "<br>" +
                    "As can be seen from the foregoing arguments, there are benefits for us in the activities of the four gentlemen, even if there are harms in them. We should be selective and prudent enough to avoid the harms- if there is any- while doing our utmost to reap the benefits. It goes without saying that we the Gambians should shape the destiny of our beloved country by ourselves, but it is not wrong to discuss its affairs with non-Gambians with the view to borrowing sound ideas from them and censuring their inept ideas, or refuting the fallacious, erroneous notions they harbour vis-a-vis our country. In this regard, we should use the maxim “Accept wisdom irrespective of where it comes from” as a guiding-principle. <br>" +
                    "<br>" +
                    "The world has become a global village. With the phenomenon of globalization, people from different parts of the world interact in various ways and at different levels. The Gambia has bi-lateral relations with different countries the world over. Gambians inter-marry with non-Gambians all over the world. Gambians seek refuge and naturalize in foreign countries. There is a sizeable number of Gambians living abroad, just as there are many migrants in The Gambia. Hence, what happens in one part of the world may directly or indirectly affect people in other parts. For these reasons and many others, people take interest in what obtains in their own countries as well as what happens in other countries, and Gambians are no exception to this. I count my humble self as an example in this respect. I comment extensively on global issues in both speech and writing, like I do as regards Gambian ones. Hence, it would be very unreasonable or folly for me to ask non-Gambians to refrain from commenting on Gambian issues. In conclusion, I vociferate that I am averse to the idea of condemning people as meddlers for showing interest or getting involved in the affairs of countries other than theirs. Such foreigners may be sincere and thus have good intention or well wishes, even if their views or opinions diverge from those of citizens. </font> <br>"
            ,
            "<font color=\"black\"><b>New Year Message</b><br>" +
                    "<br>" +
                    "As a new year- 2014 dawns, I deem it fitting to spare a moment to dilate on justice with the aim of making it a more peaceful, enjoyable year than the previous ones. In spite of the loud clamour for global peace and security, the world continues to be plagued by terrorist attacks, political turmoil, civil unrest, popular uprising, riots and the like.  The question arises now: How can we achieve the noble goal of guaranteeing world peace and security? Admittedly, it is an arduous task. However, I note in haste that the problem is not insurmountable. It can be argued cogently that justice is the key to peace and security, as we cannot enjoy veritable, durable peace and security in the absence of justice. Hence, we can resolve the problem by promoting justice to make sure that it prevails. But one may ask again: How can we ensure the prevalence of justice? This is the duty of all and sundry, particularly politicians, religious leaders and journalists who are among the most influential members of society, if not the most. <br>" +
                    "<br>" +
                    "The aforementioned nemeses are a cause for great concern because they are rampant and affect people all over the world, directly or indirectly. At this juncture, I would like to single out and expound on terrorism which receives wide media coverage and attracts so much attention globally.   <br>" +
                    "<br>" +
                    "I quite agree with the idea of waging a war against terrorism as a menace but would like to caution that the issue is being blown out of proportion in some quarters for ulterior motives. As former UN Secretary General Kofi Annan aptly put it in an interview, some world leaders capitalize on the issue to curb dissent or eliminate their opponents and perceived enemies. This has led to a situation where anybody can be branded a terrorist anywhere and anytime. The line between terrorists and non-terrorists has become too blurred and indistinct. Some of those who claim to be fighting terrorism are bigger terrorists than the people they label as terrorists. It is not only ironical but also nauseating to hear an infamous rebel leader (warlord-turned-president) call people terrorists, offering to help in the crusade against terrorism. Equally disgusting is the fact that some world leaders who terrorize their own compatriots to suppress them lack the scruples but have the guts to castigate other people, branding them terrorists. This is a case of the chimpanzee describing the baboon as “ugly”. Those leaders who brutalize their compatriots as a way of tightening their grip on power while portraying themselves as peace-makers are terrorists in disguise. Pure and simple! Whatever form terrorism takes, and whatever motive those involved in it have, terrorism is not the best way to solve a problem. I think it is one of the most irrational options. If you use terrorism as a retaliatory means, you end up killing, harming or offending innocent people and thus become culpable or guilty like your enemies or oppressors. If you suppress your people by terrorizing them, be sure that you are inviting trouble, for repression can give rise to rebellion, civil unrest, popular uprising or political turmoil and your eventual downfall and disgrace, just as we have seen recently. Beware! Terrorism does more harm than good, if at all it could be of any good. Abhor it!  <br>" +
                    "<br>" +
                    "Let me now discuss the issue of promoting justice raised earlier in the discourse and lay it to rest. Political leaders should be more considerate, attentive and sensitive to the needs and sufferings of the masses whose interest they claim to have at heart and serve. They should shun or desist from the practice of favouritism, nepotism and sectionalism and treat people equally, for the practice has the danger of breeding grudge, disgruntlement discontent, hatred, enmity disharmony and disunity. They should bear in mind that their   misbehaviour and blunders can spell doom or disaster for them in particular and their people in general. Where there is a problem, they should admit it and take remedial measures with immediate effect rather than trying to obscure the facts or shift the blame onto others by using them as scapegoats to camouflage the situation. They should always consult those who know or seek their opinions on matters of national interest instead of making rash decisions and mystifying themselves by behaving as charlatans, trying to give the impression that they know everything, possess supernatural powers and are invincible.  Whatever picture of themselves they and their flatterers try to depict, the fact remains that they are mere mortals with limited knowledge and power. As simple as that! It is worth noting that rather than impressing or convincing people, one exposes his ignorance, folly, cowardice, paranoia and vulnerability by pretending to be all-knowing or superhuman. Instead of trying to cling onto power at all cost, as if they are indispensable- which is far from being the case- political leaders should be willing to relinquish power smoothly and peacefully to pave the way for new blood. The dogged determination with which some leaders- particularly African leaders- try to perpetuate themselves in power is utterly unjustifiable. If the late Nelson Mandela (may his gentle soul rest in perfect peace) can step down after serving just one term as president despite having spent 27 odd years in jail for fighting to liberate his people, no leader can justify overstaying in power based on his sacrifices or the services he renders to his people. Those African leaders who heap praises on Mandela should emulate him. They should use tolerance, compassion, mercy and altruism or selflessness as guiding-principles as he did, which endeared him to people all over the world, regardless of religion, race and colour. They will prove themselves as shameless hypocrites if they fail to do so. Problems should not be exaggerated or invented to discredit or incriminate political rivals for selfish gains. Bullying one’s own compatriots or weaker nations should stop. <br>" +
                    "<br>" +
                    "It is the duty of religious leaders to preach justice in society   and guide political leaders. Our venerable prophet (may peace be upon him) said in this regard: “The best jihad (fight in the cause of God) is to tell the truth while sitting with a tyrant.” Of course, it is good to extol the good deeds of a political leader to encourage him but praising or flattering him all the time could lead him astray or make him swerve to the wrong path. It is a well known fact that some world leaders lack affability and are exceedingly arrogant, and feel too big to accept mistakes or take advice. If religious leaders don’t have the required wisdom or courage to call such conceited, contemptuous and misguided leaders to order   or tell them the truth when they go wrong, they should- at least- refrain from eulogizing or praising them. Otherwise, they are seen as sycophants, propagandists, puppets, accomplices or unpatriotic citizens who are insensitive to the problems of the masses. No work, act or deed is meaningful or commendable if it is accompanied by oppression or violation of human rights- injustice. Therefore, it is illogical, shameful and sinful for religious leaders to cultivate the habit of praising a political leader knowing fully well that his bad deeds outweigh his good deeds by far.  <br>" +
                    " <br>" +
                    "Journalists act as watchdogs of society besides rendering other invaluable, meritorious services to humanity. Since wrong-doers do not want their misdeeds to be exposed, the activities of investigative journalists could serve as deterrence. Journalists can help promote justice and fair play in society by conducting thorough research and reporting their findings without fear or favour, affection or ill-will. It is incumbent on them to endeavour to get their facts right, report with utmost objectivity, criticize constructively when things go wrong and avoid sensationalism, bearing in mind that freedom of expression does not mean and should not be confused with freedom of infringement, encroachment or oppression. In a nutshell, journalists should try as much as possible to abide by their codes of conduct and stick firmly to the ethics of their profession. This can help facilitate their work and minimize the dangers, damages and harms associated with irresponsible journalism.<br>" +
                    "<br>" +
                    "Happy New Year!</font><br>"
            ,
            "<font color=\"black\"><b>No Time for Squabble</b><br>" +
                    "<br>" +
                    "No time for squabble<br>" +
                    "We are cognizant that you aim to defame, distract, scare away and eventually neutralize critics and opponents of the dictator <br>" +
                    "Some people say you are hired to hinder,<br>" +
                    "But I don’t think you are on the payroll of the despot<br>" +
                    "I believe you are seeking to please him,<br>" +
                    " In order to be allowed to visit home and kick start your projects as envisaged<br>" +
                    "However, it is abundantly clear that you lack the nerve to test the waters,<br>" +
                    "As you are conspicuously hesitant to make the trip as desired   <br>" +
                    "God forbid but you may drown in the rough sea of violent waves and boundless depth if you dare to do so,<br>" +
                    "Like your Diaspora compatriots who ignored warnings and ventured<br>" +
                    "Your projects may immensely benefit you, your community and some other compatriots if implemented,<br>" +
                    "But national interest supersedes personal and group interest  <br>" +
                    "Hence, I opine that you change your attitude or switch side,<br>" +
                    "And join the struggle to rid our motherland of dictatorship for the benefit of all,  <br>" +
                    "Rather than devoting your time and energy to flaying, frustrating and frightening advocates of regime change,<br>" +
                    "Disguising as a patriot and a statesman <br>" +
                    "Your tactics of hampering will prove to be futile or fruitless,<br>" +
                    "For regime change is inevitable and will undoubtedly occur in one way or the other, sooner or later  <br>" +
                    "<br>" +
                    "No time for squabble<br>" +
                    "You strikingly resemble the despot in terms of behaviour,<br>" +
                    "Making many people doubt whether you are a good political material as you pretend to be<br>" +
                    "You sometime back complained that your “pugnacious detractors” launched a bitter attack against you,<br>" +
                    " Lamenting that they hold you in contempt on grounds I don’t subscribe to and don’t want to mention here,<br>" +
                    "That they treated you as an object of ridicule and taunt,<br>" +
                    "And that they scoffed at your “dandy” ideas and lofty goals out of grudge,<br>" +
                    "Forcing you to declare unconditional ceasefire and lay down your arms<br>" +
                    "I judged their psychological warfare unwarranted and pitied you for the ferocious mental torture they inflicted on you<br>" +
                    "But you failed to respect your words and adhere to your declaration of ceasefire, Like the dictator who behaves erratically and hardly honours his promises <br>" +
                    "You instantaneously amassed weapons of mass destruction and started firing ballistic missiles indiscriminately and discharging venom copiously at random  <br>" +
                    "If you are still belligerent and not ready for cessation of hostilities, you should direct your missiles and venom at those warmongers, <br>" +
                    "And leave peace-lovers alone <br>" +
                    "I hope you will not come out and tell us that people appealed to you to change your stance,<br>" +
                    "As the tyrant did after slaying inmates sadistically as sacrifice to his deities <br>" +
                    "<br>" +
                    "No time for squabble<br>" +
                    "The similitude between you and the despot doesn’t end there<br>" +
                    "You try to give the impression of being the best cook of all times by faulting other cooks,<br>" +
                    "Claiming that they use bad ingredients and produce unpalatable food,<br>" +
                    "Lecturing them Cookery at length,<br>" +
                    "Just like the dictator who gives experts and professionals lengthy lectures in their fields,<br>" +
                    "As a way of manifesting his “bounteous” gift of knowledge<br>" +
                    "But you ironically steal the “bad” ingredients of the very cooks you censure,<br>" +
                    "And use them in the “delicious” food you prepare<br>" +
                    "This clearly demonstrates the fact that you don’t trust your talents and skills as a self-proclaimed chef  <br>" +
                    "<br>" +
                    "No time for squabble<br>" +
                    "You accuse your perceived rivals of pomposity and showing off,<br>" +
                    "Yet, you are always eager to publicize your achievements, engagements, projects, titles, travels...<br>" +
                    "The list is interminable<br>" +
                    "This is a case of the pot calling the kettle black,<br>" +
                    "Strongly suggesting that you feel threatened in your self-aggrandizement and self-promotion endeavours<br>" +
                    "<br>" +
                    "No time for squabble<br>" +
                    "You at times play the role of a comedian<br>" +
                    "Reducing you to rubble will do a great disservice to your fans,<br>" +
                    "As they are enormously enraptured by your enchanting, thrilling performances<br>" +
                    "Therefore, it is better we spare you and concentrate on our crusade,<br>" +
                    "Allowing you to continue entertaining your fans as a humorist<br>" +
                    "We have no time for squabble  </font><br>",
            "<font color=\"black\"><b>Oh, Opportunist!</b><br>" +
                    "<br>" +
                    "Oh, Opportunist!<br>" +
                    "You need a great deal of enlightenment,<br>" +
                    "For it seems you have lost your marbles and bearing,<br>" +
                    "Behaving like those the Holy Qur’an has described as deaf, dumb and blind,<br>" +
                    "In your attempts to ingratiate yourself with your master or gain his favour,<br>" +
                    "Helping him to strengthen his hands and tighten his grip on power,<br>" +
                    "By taking lives under the guise of curbing crimes,<br>" +
                    "In addition to seizing rights, freedoms, liberties and properties<br>" +
                    "You exhibit your unscrupulousness, callousness, ruthlessness, wickedness and insensitivity to the sufferings of the masses through your obnoxious, intolerable acts<br>" +
                    "<br>" +
                    "Oh, Opportunist!<br>" +
                    "You cannot exculpate your master by demonizing or defaming his perceived enemies and detractors,<br>" +
                    "Trying to defend the indefensible and justify the unjustifiable<br>" +
                    "You end up exposing your immaturity, narrow-mindedness and short-sightedness,<br>" +
                    "Turning yourself into a laughing stock, public enemy and outcast in the process <br>" +
                    " <br>" +
                    "Oh, Opportunist!<br>" +
                    "Don’t judge others by yourself,<br>" +
                    "As not everybody can be tempted by what you see as goodies,<br>" +
                    "To compromise his or her principles,<br>" +
                    "And pledge unalloyed allegiance to the dictator as you have done,<br>" +
                    "Rendering services to him as a demigod  <br>" +
                    "You cannot wipe off your stigma by trying to stigmatize your perceived rivals who are innocent<br>" +
                    "That is like trying to make people believe that crystal is dark or snow is black<br>" +
                    "No sober, right-thinking person can be carried away by your vapid, infantile vilifications and denigrations,<br>" +
                    "Grounded in pettiness, grudge and complex<br>" +
                    "The time wasted in such frivolous talks is better spent discussing pressing issues of national interest<br>" +
                    "<br>" +
                    "Oh, Opportunist!<br>" +
                    "You better watch and take note of the Islamic principle which exhorts people not to follow a creature (human being) to the extent of wronging the Creator (God)<br>" +
                    "Woe betides you if you fail to do so!<br>" +
                    "You will regret your involvement in this dirty game one day,<br>" +
                    "Like your predecessors who used to be as busy as a bee,<br>" +
                    "Working zealously as professional bootlickers in the interest of the dictator,<br>" +
                    "But currently yarning for his downfall,<br>" +
                    "Endeavouring to undo what they have done in his favour,<br>" +
                    "Venting their spleen on him and their successors indiscriminately<br>" +
                    "Someone has theorized that the dictator should bear in mind that he can be toppled,<br>" +
                    " As the hand that has tied the rope is capable of untying it if need be<br>" +
                    "The tenability of this theory is disputable<br>" +
                    "True, a dictator can be removed with determination,<br>" +
                    "But uprooting a fully-fledged dictator could be extremely difficult,<br>" +
                    "Just as untying a tightly-tied rope could prove to be a hard job  <br>" +
                    "It is therefore folly to help a dictator entrench himself with the belief that he can be ousted when the urge is felt to do so  <br>" +
                    "To be on the safe side, it is recommendable to work with the theory “The wind that has blown the leaf into a hole cannot blow it out of the hole” when dealing with a dictator, <br>" +
                    "So as to avoid aiding the dictator to consolidate his power,<br>" +
                    "And the troubles associated with the daunting task of bringing down the dictator if or when necessary   <br>" +
                    "<br>" +
                    "Oh, Opportunist!<br>" +
                    "To your “courageous” master I turn now<br>" +
                    "Why this sudden change of stance? <br>" +
                    "Who is wrong, you or those you and your certified sycophants term as your enemies and detractors?<br>" +
                    "Many people cast doubt on the veracity of your claim that you have decided to suspend the executions in compliance with the pleas made by people within and outside the country,  <br>" +
                    "Wondering why you have bowed down and backed down,<br>" +
                    "After threatening to execute all death row inmates,<br>" +
                    "Swearing by the name of Allah,  <br>" +
                    "Cautioning your compatriots against daring to appeal to you for clemency<br>" +
                    "Is it that you fear the repercussions of your act?<br>" +
                    "Do you fear your fellow human beings more than you fear God the Almighty?<br>" +
                    "Is it that you have achieved your aim by killing the number of people you intended to kill as sacrifice?<br>" +
                    "Whatever the case may be, it is good that you have now stopped your killing spree,<br>" +
                    "For better late than never<br>" +
                    "But you should desist from taking rash actions and use the proverb “Look before you leap” as a guiding-principle next time  </font>  <br>"
            ,
            "<font color=\"black\"><b>You Are Opportunists, Not Patriots</b><br>" +
                    "<br>" +
                    "You are opportunists, not patriots<br>" +
                    "You need a great deal of edification and enlightenment,<br>" +
                    "As you have lost your bearings and swerved to the wrong path<br>" +
                    "You have taken the tyrant as your lord in lieu of God the Almighty,<br>" +
                    "In your attempts to ingratiate yourself with him or gain his favour,<br>" +
                    "And expect everybody to prostrate and bow down for him in total submission as you do<br>" +
                    "You project the despot and yourselves as the only patriotic citizens of your country,<br>" +
                    "And brand others unpatriotic citizens who want to destroy the country<br>" +
                    "Your behaviour epitomizes opportunism, not patriotism<br>" +
                    "It is utterly wrong and absurd for you to judge others by yourselves,<br>" +
                    "As not everybody can be tempted by material resources or what you see as goodies to compromise his or her integrity and principles,<br>" +
                    "Pledge unalloyed allegiance to the dictator as you have done,<br>" +
                    "And dance to his tune as he wants everybody to do<br>" +
                    "<br>" +
                    "You are opportunists, not patriots<br>" +
                    "You habitually eulogize the autocrat and scathingly criticize his rivals and perceived enemies,<br>" +
                    "Blindly defending him by justifying, denying or covering up his blunders and misdeeds,<br>" +
                    "Shifting the blame to the innocent,<br>" +
                    "With the aim of exonerating or absolving him from culpability,<br>" +
                    "As if he is infallible, impeccable and indispensable<br>" +
                    "I put it to you that you are wasting your energy,<br>" +
                    "As your goal is unrealistic and unachievable<br>" +
                    "You cannot silence or neutralize all his critics and opponents,<br>" +
                    "For most of them are determined in their acts as you are <br>" +
                    "No amount of praise-singing, denial, counter-criticism and cover-up can exculpate the tyrant,<br>" +
                    "As his record is there to speak for itself,<br>" +
                    "And will remain there for posterity to judge <br>" +
                    "<br>" +
                    "You are opportunists, not patriots <br>" +
                    "You brutally torture, mutilate, maim and kill people for the sadist,<br>" +
                    "As a way of intimidating, gagging or eliminating his opponents and perceived enemies,<br>" +
                    "Turning deaf ears to the uproarious cries of human rights activists<br>" +
                    "You mercilessly frame, incriminate, convict and incarcerate decent citizens viewed as a threat to the interest of the tyrant,<br>" +
                    "Blatantly contravening the laws of the land and the golden rule “Do to others what you would like them to do to you”,<br>" +
                    "Thereby turning yourselves to public enemies and outcasts in the process,<br>" +
                    "And later dumped or eliminated by the despot when he feels the urge to get rid of you or realizes that you have outlived your usefulness to him,<br>" +
                    "As he does whimsically and capriciously with those who do nasty jobs or run dirty errands for him <br>" +
                    "<br>" +
                    "You are opportunists, not patriots<br>" +
                    "You cite human rights violations and crimes perpetuated by people elsewhere,<br>" +
                    "And highlight the so-called achievements of the despot in terms of development,<br>" +
                    "When the tyrants is denounced for violating the rights of his own compatriots and committing atrocious crimes against them,<br>" +
                    "As though that gives him the licence to brutalize and butcher his people,<br>" +
                    "After taking an oath to protect them and serve their interest<br>" +
                    "I remind you of the sayings “Two wrongs cannot make a right” and “Injustice anywhere is injustice everywhere”,<br>" +
                    "And the fact that development is meaningless where human lives are not valued,<br>" +
                    "As the latter is more important than the former<br>" +
                    "It is also worthy to note that the money invested to bring development is from donors and state coffers, not from the pocket of the dictator as you want to fool people into believing<br>" +
                    "<br>" +
                    "You are opportunists, not patriots<br>" +
                    "You wittingly aid and abet the dictator to monopolize, personalize, plunder and squander state properties and resources,<br>" +
                    " Through his self-enrichment and self-aggrandizement schemes,<br>" +
                    "Thereby pauperizing his compatriots,<br>" +
                    "Transforming his country into a heavily-indebted, insolvent, begging nation,<br>" +
                    "Begging in the name of his impoverished, impecunious compatriots,<br>" +
                    "Only to misappropriate or embezzle huge chunks of the funds received from donors on their behalf <br>" +
                    "<br>" +
                    "You are opportunists, not patriots<br>" +
                    "You willingly and eagerly rubber stamp bills in favour of the despot,<br>" +
                    "Arming him with sweeping powers,<br>" +
                    "Denying citizens their God-given rights,<br>" +
                    "Giving him undue advantage over all citizens,<br>" +
                    "And hence transform him into a demigod,<br>" +
                    "Ignoring the interest of the electorate you claim to represent at the National Assembly,<br>" +
                    "As if you owe him more obligation than you owe the electorate<br>" +
                    "This is the climax of insincerity, unfairness and unscrupulousness <br>" +
                    "<br>" +
                    "You are opportunists, not patriots<br>" +
                    "Is the dictator the only one who can or should lead?<br>" +
                    "Is he superior to you and all your compatriots?<br>" +
                    "Is he the only one who deserves good in your country?<br>" +
                    "Does his personal interest supersede national interest?<br>" +
                    "Are you oblivious to the fact that you are strengthening the hands of the devil? <br>" +
                    "Are you not cognizant of the fact that you are placing your lives and the lives of your compatriots in jeopardy?<br>" +
                    "Do you think you can live comfortably and happily on earth with your monstrous, barbaric, beastly, odious and obnoxious acts?<br>" +
                    "How many people of your ilk have been disgraced or liquidated by tyrants, or brought to book through the efforts of democracy and human rights advocates?<br>" +
                    "Are you senseless, thoughtless, brainless, heartless or shameless?<br>" +
                    "You better wake up from your deep slumber and kick out your filthy habit before it is too late!</font><br>" +
                    "<br>",
            "<font color=\"black\"><b>Take it easy!</b><br>" +
                    "<br>" +
                    "Take it easy!<br>" +
                    "You behave as if you are superhuman,<br>" +
                    "Portraying yourself as the greatest sage, philosopher and rhetorician,<br>" +
                    "Pretending to be omnipotent, invincible, invulnerable and imperturbable,<br>" +
                    "Defying, castigating and threatening your donors, opponents and Diaspora compatriots,<br>" +
                    "As though you and your people are affluent enough to live peacefully and comfortably in isolation, <br>" +
                    "And that you have the power to crush your perceived enemies or reduce them to dust with one blow,<br>" +
                    "Seemingly oblivious to the ramifications of your reckless acts<br>" +
                    "<br>" +
                    "Take it easy!<br>" +
                    "You declined to discuss with the EU,<br>" +
                    "Complaining that they wanted to dictate you by virtue of the fact that they give financial aid to your country,<br>" +
                    "Trivializing their aid by calling it chicken change,<br>" +
                    "Saying that you don’t care about the West,<br>" +
                    "But later mobilized your home-based compatriots and instructed your rubberstamp national assembly to express solidarity with you on the issue,<br>" +
                    "Confirming the widely held belief that you are so much scared that you don’t sleep a wink these days,<br>" +
                    " Despite your assertions and bluffs<br>" +
                    "<br>" +
                    "Take it easy!<br>" +
                    "It is common knowledge that many of the projects you use as propaganda materials are financed by the EU<br>" +
                    "It is therefore ungrateful, unappreciative, irresponsible and imprudent of you to trifle with them and call the money they pump into your development projects chicken change<br>" +
                    "To say you don’t care about the EU is tantamount to saying you don’t care about the socio-economic development of your country and the wellbeing of your people <br>" +
                    "<br>" +
                    "Take it easy!<br>" +
                    "You stated categorically that you were adamant in your defiant stance regarding the proposed dialogue with the EU,<br>" +
                    "And told the members of your cabinet that any one among them who failed to concur with you should resign immediately<br>" +
                    "You amply manifested your dictatorial tendencies through your unilateral decision on this crucial matter of national interest,<br>" +
                    "Rendering the allegations you levelled against the EU fallacious, ludicrous and ridiculous<br>" +
                    "<br>" +
                    "Take it easy!<br>" +
                    "It has come to our knowledge that you have hired a Western lobbyist at an exorbitant price to help repair your soiled image <br>" +
                    "You are wasting taxpayers’ meagre resource with this irrational act<br>" +
                    "It is absurd to pay people to wash your body while wallowing in the mud continuously<br>" +
                    "The best way to repair your battered image or market yourself is to repent and be engage in good deeds,<br>" +
                    "Avoiding goofs, empty rhetoric and misdeeds as much as possible<br>" +
                    "In fact, you don’t need a Western lobbyist to market you in the West if you don’t care about the West<br>" +
                    "You have sharply contradicted yourself once again<br>" +
                    "<br>" +
                    "Take it easy!<br>" +
                    "You challenged all dissidents resident abroad to go home and face you if they are brave,<br>" +
                    "Threatening to deal with them drastically if they dare to do so<br>" +
                    "You are not more courageous than those dissidents<br>" +
                    "You are in a position to issue such threats simply because you are surrounded by bodyguards<br>" +
                    "Any short-sighted, narrow-minded person in your position can behave in the same manner <br>" +
                    "You know fully well that you would not dare to threaten anybody in the absence of guards  <br>" +
                    "You don’t have the courage to go to the countries of residence of those dissidents and confront them physically or verbally <br>" +
                    " <br>" +
                    "Take it easy!<br>" +
                    "Your commissions and omissions are multifarious and exceedingly grave<br>" +
                    "You are a fully-fledged sadist and oppressor,<br>" +
                    "Contrary to the impression you and your blindfolded loyalists try to give <br>" +
                    "It is shameful and unjust to unjustifiably punish the people you are paid to protect, <br>" +
                    " Denying them their rights, liberties and needs <br>" +
                    "Moreover, it is folly to brand helpers haters for calling you to order,<br>" +
                    " Or telling you to treat your own people with justice, fairness and mercy<br>" +
                    "In summary, your reign represents days of darkness indeed </font> <br>",
            "<font color=\"black\"><b>That serves you right!</b><br>" +
                    "<br>" +
                    "That serves you right!<br>" +
                    "It is gratifying to hear that you have once again been denied the chance to head your club,<br>" +
                    "Thereby paving the way for a relatively new member,<br>" +
                    "Despite the fact that you have been a member for quite a long time,<br>" +
                    "Vying for the post with great aspiration and expectation<br>" +
                    "Granting you the opportunity would be a grave mistake on the part of your counterparts,<br>" +
                    "For you are not the least qualified to head the club,<br>" +
                    "Given your vulgar, undiplomatic language,  <br>" +
                    "Compounded by your poor human rights record and dictatorial tendencies,<br>" +
                    "And serious deficiency in charisma, wisdom, vision and discipline<br>" +
                    "<br>" +
                    "That serves you right!<br>" +
                    "Your rejection is a tremendous devastating, humiliating blow to you,<br>" +
                    "But a victory to human rights defenders, champions of democracy and your innumerable victims and their loved ones<br>" +
                    "Giving you the honour of heading the club would mean condoning, endorsing and encouraging injustice and mischief<br>" +
                    "The fact that you continue to fail for almost two decades in your bid to head the club speaks volumes about your misconduct and misdeeds  <br>" +
                    "It shows that the international community is getting more and more acquainted with you as a villain, a misfit and an undesirable element that should be filtered out without further delay,<br>" +
                    "After you have proven yourself as a sadist and an oppressor,<br>" +
                    "And transformed yourself into an object of ridicule and a laughing stock<br>" +
                    "<br>" +
                    "That serves you right!<br>" +
                    "Allowing you to head the club would do more harm than good to your compatriots in particular and humanity at large<br>" +
                    "It would be an insult to your oppressed compatriots and a mockery to democracy<br>" +
                    "Besides, it would send wrong signals to the world by projecting you as a good person or giving you undue publicity <br>" +
                    "Bravo ECOWAS! <br>" +
                    "Keep it up! </font><br>" ,
            "<font color=\"black\"><b>The Heroine</b><br>" +
                    "<br>" +
                    "She is a heroine<br>" +
                    "She is comparable to the unnamed lady whose virtues I extolled in one of the articles I wrote in a Gambia High School student magazine in the late 80s under the little Je Ne Sais Quoi,<br>" +
                    "Calling her a moralist, an egalitarian, an iron lady, the woman of the people and our mother,<br>" +
                    "In appreciation of her unalloyed dedication, invaluable services and nice manners which endeared her to students and teachers who held her in a very high esteem- qualities which later earned her the post of principal with principles <br>" +
                    "She resembles the diligent, undaunted and tireless Maafanta lady I called a precious asset and a source of inspiration, <br>" +
                    "And said is worthy of emulation,<br>" +
                    "Exhorting men and women to borrow a leaf from her book,<br>" +
                    " In my reciprocal encomium entitled I Am Gambian Too,<br>" +
                    "Published in Gambian online newspapers, <br>" +
                    "She looks like the DUGA DC ladies I lauded in a letter to Maafanta,<br>" +
                    "Calling them lionesses,<br>" +
                    "Praying that their meritorious services in our crusade bear fruits<br>" +
                    "But she is quite different from the misguided, errant women at the disposal of the despot, <br>" +
                    "Seeking to please him in order to gain his favour,<br>" +
                    "Serving him assiduously and relentlessly as propaganda tools, image-makers, praise-singers, farmworkers and dancers,<br>" +
                    "Oblivious to or unmindful of his sadism, egoism, egotism, megalomania, kleptomania and insensitivity to the sufferings of the masses,<br>" +
                    "Evidenced by his exceeding brutality, flagrant mismanagement and misappropriation of public funds, blatant looting of meagre, direly-needed state resources, ostentatious lifestyle and sheer lack of respect and consideration for his compatriots<br>" +
                    "<br>" +
                    "She is a heroine<br>" +
                    "Her appearance on Fatu Radio during the Fass Njaga Choi standoff was highly welcome  <br>" +
                    "It was an opportune moment for her launch an appeal,<br>" +
                    "And manifest her stance and determination as a woman of charisma, integrity and dignity,<br>" +
                    "In our noble cause of crusading to crush dictatorship and bring sanity to our beloved country for the betterment of all<br>" +
                    "She articulated herself eloquently in an extremely moving speech,<br>" +
                    " Telling the whole world that she had travelled to Fass Njaga Choi to express solidarity and lend helping hands to the industrious leader of the biggest opposition party in our country and his entourage, <br>" +
                    "When their convoy was intercepted there by police officers acting on the orders of the dictator whose aim was to intimidate and frustrate them,<br>" +
                    "While they were on a nationwide tour to sensitize the populace on the dire situation of the country<br>" +
                    "She appealed to the general public to empathize with and help disentangle the party leader and militants, who were held up for no valid or genuine reason,  <br>" +
                    "Emphasizing the urgency to come to their rescue,<br>" +
                    "The importance of boosting their morale,<br>" +
                    " And the need to concretize and accelerate our efforts to end dictatorship in our country<br>" +
                    "Her message had a tremendous impact,<br>" +
                    "For it yielded dividend as desired<br>" +
                    "People responded positively to her plea by giving their moral and financial support,<br>" +
                    "And hailed her as a heroine for her devotion, commitment and courage,<br>" +
                    "As one of the very few people on the rough terrain who are ready to talk to the press openly and freely<br>" +
                    "I highly commend Fatu Radio for providing for her the required platform to address her compatriots publicly in that manner for the first time<br>" +
                    "<br>" +
                    "She is a heroine<br>" +
                    "Her exclusive interview on Freedom Radio was very revealing<br>" +
                    "She seized the opportunity to clear the air and shed light on many issues of national interest,<br>" +
                    "To the satisfaction of many listeners who were spell-bound and dumbfounded by some of her revelations<br>" +
                    "She explained how the dictator appointed her minister in the junta regime without having the courtesy to consult her and seek her consent,<br>" +
                    " Insisting that she must accept the offer,<br>" +
                    "Despite her unwillingness and the plausible, tangible excuses she gave, <br>" +
                    "Such as conflict of interest as a relative of one of the junta members, <br>" +
                    "Her firm belief in democratic principles,<br>" +
                    " And her desire to continue her work with the UNDP <br>" +
                    "She said her family members didn’t want her to work with the junta<br>" +
                    " This is substantiated by her son’s statement on Freedom Radio before her interview<br>" +
                    "The gentleman told Pa Nderry Mbai unequivocally that he was strongly opposed to her mother’s appointment by the junta<br>" +
                    "Her relative in the junta also objected based on the junta’s vow to combat nepotism, <br>" +
                    "But she had no alternative other than bowing down to pressure and complying reluctantly when the dictator threatened to close the UNDP office if she declined the offer<br>" +
                    "She said she preferred working with the junta to seeing the UNDP office closed,<br>" +
                    "As the masses would be the ones to bear the brunt by undeservingly suffering the consequences, <br>" +
                    "Which she didn’t want to happen<br>" +
                    "She revealed how she asked the junta leader to relieve her of her duties when her relative fell out with him,<br>" +
                    "Citing possible mistrust on the part of the junta as the reason for her decision<br>" +
                    "She explained that she found the junta leader putting on dark glasses to avoid eye contact with her when she went to meet with him in his office,<br>" +
                    "Claiming that he had eye problems<br>" +
                    "She pretended that she didn’t understand his game,<br>" +
                    "And hence called a female doctor for him<br>" +
                    "She said she wrote her handing-over notes soon after learning of the downfall of her relative, <br>" +
                    "In preparation for her departure from cabinet  <br>" +
                    " She also disclosed how the junta discourteously dismissed her after the leader refused to let her go of her own accord as she intended and assured her of his “willingness” to continue working with her<br>" +
                    "This clearly demonstrates his malicious intention to soil her reputation by portraying her in a negative light through dismissal <br>" +
                    "After dismissing her, the junta ordered the NIA to investigate her on the allegation of conspiring with her relative to overthrow their regime with a view to occupying the post of vice-president<br>" +
                    "The over-zealous, blindly-obedient NIA eagerly went for her and took her to their office for interrogation as instructed<br>" +
                    "She vehemently denied the allegation and told them in no uncertain terms that she wouldn’t accept being subjected to harassment,<br>" +
                    "Making it abundantly clear that she wouldn’t report to their office to be interrogated any more as they ordered her, <br>" +
                    "And that they could arrest her if they so wished<br>" +
                    "She teasing asked the NIA boss whether it was proper for him to summon her sister as he did<br>" +
                    "She reduced to rubble two insolent, shameless, unscrupulous and unsympathetic junta members who addressed her laughing after her removal from office <br>" +
                    "She told the rascals that they should have treated her as their sister rather than taunting her and laughing at her<br>" +
                    "Also startling is her revelation of the dictator’s refusal to declare his assets as he had asked junta and cabinet members to do<br>" +
                    "He failed to lead by example as expected of him<br>" +
                    "I wonder why he decreed declaration of assets know fully well that he was not willing to abide by the decree<br>" +
                    "Whether his refusal was due to pomposity or lack of assets to declare is anybody’s guess<br>" +
                    "According to her, the junta regime owed her money in the form of travel expenses which she claimed after her sacking, <br>" +
                    "But the junta leader gave a directive not to pay her a single butut<br>" +
                    "She vociferated her aversion to forced-labour on the dictator’s farms,<br>" +
                    "Saying that she wouldn’t do farm work for him under any circumstance<br>" +
                    "<br>" +
                    "She is a heroine<br>" +
                    "She answered in the affirmative when asked whether she was concerned about the behaviour of her relative before his fall-out with the junta leader and his subsequent arrest    <br>" +
                    "There was public outcry regarding his behaviour as deputy leader of the junta, <br>" +
                    "With the general public accusing him of abusing his powers by mercilessly mistreating innocent people <br>" +
                    "She said she had tried twice to sit with him and advise him without avail,<br>" +
                    "That she later wrote a lengthy letter to him conveying her concerns and advice, <br>" +
                    "And that he invited her for discussion after receiving the letter<br>" +
                    "She reiterated her concerns and advice to him during their discussion,<br>" +
                    "But the man told her that Gambians deserved that treatment and that he wanted to inculcate discipline in them   <br>" +
                    "She disclosed that a cabinet colleague of hers resigned based on principle and showed her a copy of his resignation letter,<br>" +
                    "Contrary to the claim of the junta that they had dismissed him<br>" +
                    "She said she believed the motive behind the junta’s claim was just to protect their image,<br>" +
                    "As announcing his resignation would give a negative impression of them,<br>" +
                    "Given that the individual concerned was popular and regarded as man of high calibre <br>" +
                    "<br>" +
                    "She is a heroine<br>" +
                    "She convincingly highlighted her achievements during her short tenure of office in the junta regime <br>" +
                    "She played a very vital role in making important reforms, formulating policies, developing strategies and acquiring valuable, much-needed equipment and materials in her ministry <br>" +
                    "She was very instrumental in revamping and boosting our information and communication sector by negotiating deals with the French <br>" +
                    "She made giant strides in wooing organisations such as the EU and the UN that were not in good terms with the junta regime<br>" +
                    "She mentored him in the area of diplomacy and international relations,<br>" +
                    "Coaching him on how to comport himself when dealing with the international community- particularly our immediate neighbour Senegal<br>" +
                    "To a large extent, this cleared the mistrust and suspicion the Senegalese authorities initially had vis-à-vis the junta leader as result of his indecorous, undiplomatic attitude<br>" +
                    "But it is unfortunate that he forgot what he learnt in the twinkling of an eye and reverted to his bad manners<br>" +
                    "His queer, eccentric and mercurial behaviour lends credence to the saying “Old habits die hard” <br>" +
                    "<br>" +
                    "She is a heroine<br>" +
                    "Her message to the freedom fighters embedded in her closing remarks is important and noteworthy<br>" +
                    "She advised us to stop wrangling, bickering and squabbling,<br>" +
                    " And concentrate on the crusade and forge ahead,<br>" +
                    "Bearing in mind that what unites us- our fervent desire to get rid of the dictator- outweighs what separates us- our divergence in views<br>" +
                    "What a dandy idea!<br>" +
                    "I quite concur with her<br>" +
                    "I hope all those concerned will see reason and pay heed<br>" +
                    "I thunderously applaud Pa Nderry Mbai of Freedom Radio for receiving her with open arms and asking her probing questions of public interest <br>" +
                    "<br>" +
                    "She is a heroine<br>" +
                    "She is one of the bravest and most illustrious, admirable daughters of our motherland<br>" +
                    "She is fully cognizant of the fact that politics is everybody’s business,<br>" +
                    "As it affects the lives of all- positively or negatively, directly or indirectly,<br>" +
                    "Regardless of whether they are interested in it or not,<br>" +
                    "And that taciturnity and indifference cannot help in our terrible situation which keeps worsening by the second,<br>" +
                    "And thus needs to be remedied as a matter of urgency<br>" +
                    "As I said about the aforementioned Maafanta lady who happens to be her namesake, I wish we had thousands like her<br>" +
                    "I hope the silent, inactive women on our side and those on the wrong side of the political divide will soon see the light and emulate her as a role model  <br>" +
                    "I salute Auntie Fatoumatta Jallow Tambajang with my hat off,<br>" +
                    " And pray for her longevity, good health and eternal peace <br>" +
                    "Keep up the momentum!</font><br>",
            "<font color=\"black\"><b>Using Pseudonym: Is it proper or improper?</b><br>" +
                    "<br>" +
                    "The question as to whether it is proper or improper to use a pseudonym cannot be given a straight, cogent answer such as “yes” or “no” without elaboration. Therefore, I deem it fitting to do some analysis and make comments in my attempt to answer it convincingly. <br>" +
                    "<br>" +
                    "First and foremost, I would like to point out that I have never used a pseudonym, neither in the social media nor in the press. I have been using my name and photo since I started writing as a novelist and feature writer in 1997. I have taken this stance for the simple reason that I want to assume responsibility for my writings and do not see the need to use a pen mane.  <br>" +
                    "<br>" +
                    "Nonetheless, I understand and respect the position of some of those who have chosen to be anonymous in their activities. It is common knowledge that some writers, freedom fighters and activists have used pseudonyms and contributed immensely to political and socio-economic development.  The renowned, reputable politician Nelson Mandela and the prolific British writer Eric Blair, the author of the famous novel Animal Farm can be cited as examples in this regards, among many others. They have used the pseudonyms David Motsamayi and George Orwell respectively. Is it reasonable and fair to disregard or ignore the meritorious services they have rendered to humanity and denounce them for merely using pseudonyms? Certainly not! It is an open secret that many Gambians have used the online media pseudonymously for long time before coming out of their closets to openly champion democracy, justice and respect for human rights. It is also a well-known, irrefutable fact that some contributors in our crusade have always been anonymous, doing a wonderful job. It can be argued that this category of people use pseudonyms for security or other reasons that are not malicious. Thus, they deserve commendation and cheers, not condemnation and jeers.     <br>" +
                    "<br>" +
                    "However, many people hide behind pen names to bully, harass, malign, intimidate, detract, distract or frustrate those they perceive as enemies, rivals or opponents. These people are big cowards. Pure and Simple! They are undesirable elements, for they pose a threat to peace and retard development by using pseudonyms maliciously.  <br>" +
                    "<br>" +
                    "To recapitulate, I would say that using a pseudonym can be proper just as it can be improper, depending on the purpose for which it is used. Hence, there shouldn’t be blanket endorsement or denunciation on the issue. Those who use pseudonyms with good intention shouldn’t be condemned, nor should they be frightened off. If we are really interested in liberating ourselves and creating a just society for the benefit of all, as we claim, we should encourage them to continue contributing their quota in the noble cause of combatting dictatorship, or at least leave them in peace. Those who use pseudonyms to discourage, scared away or neutralize freedom fighters are doing more harm than good to themselves and their compatriots in general, as no one is safe or secure under a dictatorship. Anybody can fall victim anytime in a society where injustice prevails. The earlier those ill-intentioned, misguided people realize this and desist from their obnoxious, detestable acts and join the bandwagon of the crusaders, the better for us all. They have been brainwashed, and they have remained in their deep sleep for too long. What a pity!  </font><br>"
            ,
            "<font color=\"black\"><b>What a Danger!</b><br>" +
                    "<br>" +
                    "You brutally torture, mutilate, maim and kill people for the sadist,<br>" +
                    "As away of intimidating, gagging or eliminating his opponents and perceived enemies,<br>" +
                    "Turning deaf ears to the uproarious cries of human rights activists<br>" +
                    "What a danger!<br>" +
                    "<br>" +
                    "You mercilessly frame, incriminate, convict and incarcerate decent, patriotic citizens perceived as a threat to the interest of the tyrant,<br>" +
                    "Blatantly contravening the laws of the land,<br>" +
                    "Disregarding the fact that injustice anywhere is injustice everywhere<br>" +
                    "What a danger!<br>" +
                    "<br>" +
                    "You wittingly aid and abet the egoist to monopolize, personalize, plunder and squander state properties,<br>" +
                    " Through his self-enrichment and self-aggrandizement schemes,<br>" +
                    "Thereby pauperizing his compatriots,<br>" +
                    "Transforming his country into a heavily-indebted, insolvent, begging nation,<br>" +
                    "Using knee pads to kneel down on and unscrupulously beg the entire world,<br>" +
                    "In the name of his impoverished, impecunious compatriots who may be deprived of the proceeds as usual,<br>" +
                    "Using their plight as a pretext to justify his ironical, dubious move,<br>" +
                    "After having publicly denounced begging and vowed never to beg in his life,<br>" +
                    "Scoffing at the idea of NEPAD (New Partnership for Africa’s Development),<br>" +
                    "Caricaturing, deriding and ridiculing his counterparts who had initiated it,<br>" +
                    "Saying scornfully and contemptuously that they are beggars and that NEPAD should be renamed Knee Pad as such,  <br>" +
                    "And bragged of the discovery of a treasure which he claimed he would use to turn his country into an economic super power and a major donor in no time, <br>" +
                    "Professing that it would catch up with or even outstrip countries that are superfluously rich in minerals and other natural resources in the twinkle of an eye<br>" +
                    "What a danger!<br>" +
                    "<br>" +
                    "You willingly rubber stamp bills in favour of the despot,<br>" +
                    "Arming him with sweeping powers,<br>" +
                    "Giving him undue advantage over all citizens,<br>" +
                    "As though he is a demigod,<br>" +
                    "Ignoring the interest of the electorate you claim to represent at the National Assembly<br>" +
                    "What a danger! <br>" +
                    " <br>" +
                    "You habitually eulogize the autocrat and scathingly criticize his rivals and perceived detractors,<br>" +
                    "Blindly defending him by justifying or covering up his wrongs or misdeeds,<br>" +
                    "Shifting all blame to the innocent,<br>" +
                    "With the aim of exonerating or absolving him from culpability,<br>" +
                    "As if he is infallible, impeccable and indispensable<br>" +
                    "What a danger!<br>" +
                    "<br>" +
                    "Is the dictator superior to you and all your compatriots?<br>" +
                    "Is he the only one who deserves good in your country?<br>" +
                    "Can the interest of the megalomaniac supersede national interest?  <br>" +
                    "Are you oblivious to the fact you are strengthening the hands of the devil?<br>" +
                    "Are you not cognizant of the fact that you are placing your life and that of your compatriots in jeopardy?<br>" +
                    "Do you think you can live comfortably and happily on earth with your monstrous, uncivilized, barbaric, beastly, odious and obnoxious acts?<br>" +
                    "How many people of your ilk have been disgraced, brutalized or liquidated by their masters, or brought to book by democracy and human rights advocates?<br>" +
                    "Are you senseless, thoughtless, brainless, heartless or shameless?<br>" +
                    "You better wake up from your deep slumber and kick out your nasty habit before it is too late!</font><br>",
            "<font color=\"black\"><b>What an Irony!</b><br>" +
                    "<br>" +
                    "You claim to have all the answers to all ailments<br>" +
                    "Offering to cure patients free of charge<br>" +
                    "And boast of having provided your country with state-of-the-art health facilities and good medical experts  <br>" +
                    "Yet, you travel and send your family members abroad for medical treatment,<br>" +
                    "In countries you call enemies of Africa<br>" +
                    "What an irony!<br>" +
                    "Can’t you cure yourself and your family members? <br>" +
                    "Why deny yourself and your family members your services?<br>" +
                    "Don’t you trust the health facilities and medical experts in your country?<br>" +
                    "Do you consider it wise, reasonable or advisable to seek medical treatment from your enemies? <br>" +
                    "  <br>" +
                    "You regard your compatriots in the Diaspora as riffraff and nonentities,<br>" +
                    "Who have nothing good to offer their country <br>" +
                    " And call them unpatriotic citizens, saboteurs, detractors and dish washers<br>" +
                    "Challenging your home-based compatriots to show you anything realized by your Diaspora compatriots at home<br>" +
                    "Saying that the latter should wash their hands, <br>" +
                    "Off matters affecting their home country<br>" +
                    "Yet, you invite them to a meeting at home<br>" +
                    "Claiming that you want to make use of their knowledge, expertise, skills, talents and resources, <br>" +
                    "To accelerate the socio-economic development of their motherland<br>" +
                    "What an irony!<br>" +
                    "What is the motive behind this sudden change of heart and stance?<br>" +
                    "Have you run out of ideas and resources?<br>" +
                    "Have your Diaspora compatriots changed attitude instantaneously and become productive?<br>" +
                    "Are you not putting the cart before the horse?<br>" +
                    "Don’t you think it is more rational to make the atmosphere conducive before starting a dialogue?<br>" +
                    "Is your move meant to quicken the socio-economic development of your country or repair your soiled, battered image?  <br>" +
                    " <br>" +
                    "You preach Pan-Africanism ad nauseam <br>" +
                    "Claiming to be an ardent Pan-Africanist <br>" +
                    "And customarily castigate Westerners in your vapid, vacuous, inane, frivolous tirades  <br>" +
                    "Calling them pests, locusts, encroachers, exploiters and haters<br>" +
                    "Yet, you don’t want children born on African soil<br>" +
                    "But prefer and endeavour to secure Western citizenship for your children<br>" +
                    "And buy expensive properties in the West <br>" +
                    "What an irony!<br>" +
                    "Are you not telling Africans to do as you say but not as you do?<br>" +
                    "Why not practise what you preach?<br>" +
                    "Are you a real or a fake Pan-Africanist?<br>" +
                    "Is Pan-Africanism determined by words or actions?<br>" +
                    "Don’t you think actions speak louder than words?<br>" +
                    "Don’t you believe in leading by examples?<br>" +
                    "  <br>" +
                    "You recently flayed a foreign government for arraigning children involved in riots<br>" +
                    "Forgetting that armless, harmless schoolchildren have been butchered with impunity under your watch,<br>" +
                    "For protesting over the killing and rape of their colleagues<br>" +
                    "With the perpetrators of the heinous crimes granted blanket immunity,<br>" +
                    "Adding insult to injury<br>" +
                    "And later had children incarcerated,<br>" +
                    "For allegedly attempting to barricade your way with a string<br>" +
                    "What an irony! <br>" +
                    "Is it logical to lambast a foreign government for maltreating its children while shamelessly brutalizing yours?<br>" +
                    "Is this not a case of advising others to take bath while wallowing in the mud?<br>" +
                    "Do you care more for the wellbeing of the children in that country than that of the children in your own country?<br>" +
                    "Are you telling us that the former are superior to the latter and deserve better treatment than them?<br>" +
                    "<br>" +
                    "You pretend to be brave and possess supernatural powers<br>" +
                    "Yet, you use the meagre resources of your country,<br>" +
                    "To purchase and pile up heavy weapons<br>" +
                    "And build bunkers and tunnels, <br>" +
                    "To be used as hideouts and escape routes in case of emergency<br>" +
                    "Surrounding yourself with guards armed to the teeth all the time<br>" +
                    "Buying the loyalty of armed and security forces with incentives<br>" +
                    "Hiring witch-hunters to pinpoint suspected sorcerers, <br>" +
                    "By forcing them to drink hallucinogenic, poisonous concoctions,<br>" +
                    "Resulting in serious health complications and deaths <br>" +
                    "What an irony! <br>" +
                    "Why all these precautionary measures?<br>" +
                    "Why do you need tight security?<br>" +
                    "Why do you need the services of witch-hunters?<br>" +
                    "Can’t you give your demons instructions to crush those who bear malice or grudge against you?<br>" +
                    "Can’t you cast a spell on those who try to undermine you or frustrate your efforts?<br>" +
                    "Can’t you simply disappear when faced with danger?<br>" +
                    "<br>" +
                    "You have sworn by the Holy Qur’an, <br>" +
                    "To serve your people without fear of favour, affection or ill-will<br>" +
                    "And always tell your compatriots that you would not compromise their security<br>" +
                    "Asserting that you are ready to die for them<br>" +
                    "Yet, you clearly manifest your utter reluctance to investigate cases of assassination and disappearance,  <br>" +
                    "Of your compatriots under suspicious, mysterious circumstances<br>" +
                    "And fly into a rage when reminded to take necessary action<br>" +
                    "Coming up with absurd, implausible, preposterous, untenable unconvincing arguments,<br>" +
                    "Making silly, opprobrious, taunting, sarcastic, provocative remarks<br>" +
                    "In your desperate, goofy, futile, lame, vain attempts to cover up or exculpate yourself,<br>" +
                    "Thereby arousing more suspicion<br>" +
                    "But always eager to order an investigation,<br>" +
                    "In matters affecting your security<br>" +
                    "And punish culprits or suspects without hesitation <br>" +
                    "What an irony!<br>" +
                    "Haven’t you reneged on your obligation and promises in this respect?<br>" +
                    "Are you not more interested in your personal security than that of your compatriots?<br>" +
                    "Don’t you believe in the holiness of the Holy Qur’an?<br>" +
                    "Do you think you can outwit God? <br>" +
                    "<br>" +
                    " You portray yourself as a devoted Muslim and an espouser of the cause of Islam<br>" +
                    "Yet, you organize wrestling contests for women,<br>" +
                    "And beauty pageants for schoolgirls<br>" +
                    "Claiming that you want to promote culture and girls’ education, <br>" +
                    "By dishing out money and awarding scholarships to winners<br>" +
                    "What an irony! <br>" +
                    "Do you think such acts are in line with the teachings of Islam?<br>" +
                    "Why subject women to such a demeaning, debasing, degrading, dehumanizing treatment?<br>" +
                    "Why not use interviews and the academic records of schoolgirls to determine eligibility for scholarships?<br>" +
                    "Or you want to tell us that academic potential is governed by beauty?<br>" +
                    "Are you genuinely interested in promoting culture and girls’ education by organizing such competitions?<br>" +
                    "Are wrestling contests and beauty pageants the best means of promoting culture and girls’ education?<br>" +
                    "<br>" +
                    "Evidently, you are a shady, dubitable character<br>" +
                    "Who can you convince with all these contradictions?<br>" +
                    "Only the gullible!<br>" +
                    "Who do you expect to take you seriously with this hypocrisy?<br>" +
                    "Only the naïve!<br>" +
                    "Who can believe you with your quadruple standards?<br>" +
                    "Only a credulous fool!</font><br>" +
                    "  <br>",
            "<font color=\"black\"><b>Who is the problem?</b><br>" +
                    "<br>" +
                    "Who is the problem?<br>" +
                    "The ranting tyrant who threatened to implement the death penalty to the letter,<br>" +
                    "After sending his wife and kids to seek sanctuary in the West,<br>" +
                    "And allegedly carried out his threat in the twinkling of an eye,<br>" +
                    "To the bewilderment and disgust of the whole world, <br>" +
                    "Forgetting that he used treasonable means to ascend power,<br>" +
                    "And that many people have been assassinated during his reign,<br>" +
                    "With his flat, blatant refusal to bring the culprits to book,<br>" +
                    "In spite of his keenness to fish out and cruelly crush those who pose a threat to his security,<br>" +
                    "Strongly suggesting complicity and commanding role on his part <br>" +
                    "Such a despot deserves execution more than those he calls criminals,<br>" +
                    "For his crimes are much more serious than theirs<br>" +
                    "<br>" +
                    "Who is the problem?<br>" +
                    "The treacherous, perfidious, ravenous, rapacious, voracious and venomous leader,<br>" +
                    " Who monstrously misappropriates, dispossesses, encroaches, victimizes, brutalizes and persecutes, <br>" +
                    " To amass wealth and perpetuate himself in power,<br>" +
                    "Trying to control everybody and everything,<br>" +
                    "Including babies on their mothers’ laps, corpses at the graveyard, monkeys in the forest, fish in the ocean and birds in the air<br>" +
                    "Leading a flamboyant lifestyle with unprecedented extravagance which he initially condemned,<br>" +
                    "  Boastfully, shamelessly and unscrupulously displaying his ill-gotten wealth,<br>" +
                    "Saying publicly that his great-grand children will never be poor<br>" +
                    "Making empty promises to create a vibrant public service and develop his country with extraordinary rapidity<br>" +
                    "But ironically treats public servants as toys,<br>" +
                    "By hiring, firing and recycling them whimsically, <br>" +
                    "Leaving them in despair, despondence, disgruntlement, discouragement and embitterment,<br>" +
                    "Causing attrition rate to hop and gallop alarmingly fast, <br>" +
                    " Depleting the human resources supply of the public sector<br>" +
                    "<br>" +
                    "Who is the problem?<br>" +
                    "The accused person who audaciously lambasted his compatriots residing in the Diaspora, <br>" +
                    "For daring to denounce human rights violations in their native country,<br>" +
                    "Failing to pay heed to the maxim that those who live in glass houses should not throw stones <br>" +
                    "Arguing fallaciously and preposterously,<br>" +
                    " That his Diaspora compatriots should not discuss human rights issues affecting their home country while turning blind eyes to human rights violations taking place in the West,<br>" +
                    "Despite fleeing his country to seek refuge in the West    <br>" +
                    "Falling short of absolving himself from the allegations of gross, atrocious human rights violations levelled against him,<br>" +
                    "Corroborating the accusations that he terrorized and summarily executed many of his compatriots during his short tenure of office,<br>" +
                    "Lending credence to the widely held belief that too many people would lose their lives or suffer miserably at his hands if he stayed longer in office or occupied a higher position of responsibility <br>" +
                    "No wonder, many people breathed a sigh of relief and rejoiced over his sudden downfall,<br>" +
                    "Shouting “good riddance!” at the top of their voices <br>" +
                    "<br>" +
                    "  Who is the problem?<br>" +
                    "The one who aids and abets the dictator in his dirty game,<br>" +
                    "By serving as a killer, torturer, spy, errand boy, spin doctor, prevaricator, obscurantist or defender for him,<br>" +
                    "Disregarding the excruciating, unendurable sufferings he inflicts on his people,<br>" +
                    "Only to be axed by the ungrateful despot and humiliated, disgraced or forced to drink his own medicine in the long run <br>" +
                    "<br>" +
                    "Who is the problem?<br>" +
                    " Not the one who has worked laboriously and acquired knowledge and skills in different disciplines, <br>" +
                    "Which he utilizes as a vehicle for championing democracy and defending human rights,<br>" +
                    "To promote justice, fair play and peace,<br>" +
                    "Contributing his quota in educating and enlightening to the best of his ability<br>" +
                    "Such a person deserves cheers, not jeers<br>" +
                    "He should be honoured, hailed and emulated, not begrudged, belittled and portrayed as the problem <br>" +
                    "<br>" +
                    "No amount of denial, gimmickry, quackery, mimicry, philosophizing, fudging, bragging, self-praising, self-glorification, self-mystification, distortion, vituperation, camouflage, calumny or slander can alter facts or change history <br>" +
                    "Attempting to do so is an exercise in futility, <br>" +
                    "Akin to trying to shroud the rays of the sun in totality<br>" +
                    "<br>" +
                    "A word for the wise is enough, goes the saying<br>" +
                    "But it is good to repeat as a reminder for the benefit of those who lack wisdom,<br>" +
                    "As Allah the Omniscient has urged in the Glorious Qur’an: “Remind people, for a reminder could be beneficial”  </font><br>",
            "<font color=\"black\"><b>You Are To Blame, Yahya</b><br>" +
                    "<br>" +
                    "You are to blame, Yahya<br>" +
                    "A bad worker always quarrels with his tools<br>" +
                    "The above proverb befits you<br>" +
                    "You behave as if you are the most knowledgeable and intelligent person who has ever lived on earth,<br>" +
                    "Treating others as ignorant and dull people<br>" +
                    "You take credit for everything good and blame others whenever things go wrong,<br>" +
                    "Using the innocent as scapegoats,<br>" +
                    "Punishing them where you deserve punishment<br>" +
                    "<br>" +
                    "You are to blame, Yahya<br>" +
                    "You have blamed the acute foreign currency shortage in your country and the depreciation of your currency against foreign curries on foreign currency dealers,<br>" +
                    "Accusing them of hoarding foreign currencies,<br>" +
                    "And hence declared their licences null and void,<br>" +
                    "Forcing them to reregister with huge sums of money,<br>" +
                    "After ordering your law enforcement agents to go around and seize any foreign currency found in their possession,<br>" +
                    "Thereby creating chaos and inconvenience for people<br>" +
                    "Some people speculate that the motive behind your move is to amass money to pay the salaries   of civil servants as your government is broke and unable to pay salaries,<br>" +
                    "And others allege that the money confiscated is meant for your wife to blow in the US<br>" +
                    "Don’t you think your interference has negative effects and aggravates the situation?<br>" +
                    "If you love your country as you always claim, why inconvenience your compatriots at home and abroad through such an irrational, irresponsible move?<br>" +
                    "Are you sure you have the right to seize the hard-earned money of those foreign currency dealers?<br>" +
                    "<br>" +
                    "You are to blame, Yahya<br>" +
                    "You always lay the blame squarely on the feet of traders regarding increase in the price of commodities,<br>" +
                    "Calling them unpatriotic, unscrupulous and merciless merchants,<br>" +
                    "Despite the fact that you continue to increase tax on imported goods,<br>" +
                    "And your claim during an airport interview that no-one can fool you in economics as economics is just common sense<br>" +
                    "Your deeds and utterances defy the principle of economics according to which traders shift tax burden to consumers<br>" +
                    "If you really understand economics as you want to make us believe and have more mercy than the merchants you blame for price hike, why not consider lowering the tax on basic commodities?<br>" +
                    "Given the fact that you can import commodities without paying tax, is it reasonable or fair for you to compare your prices to theirs?<br>" +
                    "Do you expect those traders to sell their merchandise at a loss?<br>" +
                    "Don’t you know that they are in business to make profit?<br>" +
                    "Why not use your common sense and vast “knowledge” of economics?<br>" +
                    "<br>" +
                    "You are to blame, Yahya<br>" +
                    "You recently ordered the arrest and banishment of the handicapped begging on the streets,<br>" +
                    "Accusing them of causing nuisance and disturbing public order,<br>" +
                    "As a way of covering up poverty in your country<br>" +
                    "This is the climax of mercilessness<br>" +
                    "A compassionate leader would consider formulating policies to support them,<br>" +
                    "Bearing in mind that they have not chosen to be disabled,<br>" +
                    "That it is Allah the Almighty who has made them what they are,<br>" +
                    "And that anybody can be handicapped as long as he is alive<br>" +
                    "How would you feel if you or your loved ones were in the position of those beggars who were bundled and thrown out of the cities? <br>" +
                    "Do you judge it more rational or logical to try to hide poverty than to eradicate or alleviate it? <br>" +
                    "Why not use the money you spend on misplaced priorities to help beggars?<br>" +
                    "<br>" +
                    "You are to blame, Yahya<br>" +
                    "You severely criticize our former colonial masters in your customary invectives,<br>" +
                    "Calling them all sorts of names<br>" +
                    "You recently complained of encroachment and exploitation on their part,<br>" +
                    "Claiming that the only thing they have left us with is their “stupid” English language,<br>" +
                    "The language in which you address your daughter as we have seen in a video,<br>" +
                    "Maybe the only language she speaks<br>" +
                    "You have no excuse for your failures,<br>" +
                    "As the colonialists left long ago,<br>" +
                    "And you have spent almost two decades at the helm of the government of our beloved country<br>" +
                    "It is undeniable that the colonialists have oppressed us,<br>" +
                    "But it is more disheartening and intolerable to be oppressed by one’s own compatriot who has sworn to serve his interest and defend him as you always do<br>" +
                    "It is recommendable and desirable to have an indigenous language as official language and medium of instruction as soon as possible,<br>" +
                    "But we have to make do with the English language until we are able to standardize and use an indigenous language<br>" +
                    "Do you think you can free yourself from blame by blaming the colonialists all the time?<br>" +
                    "If you believe English is a stupid language, do you consider it wise or advisable to address your daughter in English?<br>" +
                    "Why not use a language other than English in order not to make her stupid?<br>" +
                    "<br>" +
                    "You are to blame, Yahya<br>" +
                    "You have threatened to stop military co-operation with Western countries,<br>" +
                    "Accusing them of indoctrinating and making rebellious soldiers who undergo training there,<br>" +
                    "In spite of the fact that you have benefited from the training programme you want to deny your soldiers,<br>" +
                    "And staged a coup shortly upon returning to your country<br>" +
                    "Were you indoctrinated during your training?<br>" +
                    "Why cancel the agreement now?<br>" +
                    "Is your decision based on fear of being overthrown as you did to your predecessor?<br>" +
                    "Isn’t it selfish of you to deny your soldiers the opportunity to train in Western countries as you have done?<br>" +
                    "Don’t you think that treating your compatriots nicely is a better way of avoiding coup than depriving soldiers of career development which they deserve? <br>" +
                    "<br>" +
                    "You are to blame, Yahya<br>" +
                    "You like praises which signify loyalty and obedience to you,<br>" +
                    "And detest criticism and advice which you interpret as contempt and scorn,<br>" +
                    "As evidenced by your appointment of praise-singers and sycophants to high positions of responsibility,<br>" +
                    "And your hostile attitude towards those who criticize you or voice opinions different from yours<br>" +
                    "Yet, you have the guts but lack the scruples to blame religious leaders for not advising you,<br>" +
                    "Claiming that they have failed in their duties<br>" +
                    "True, religious leaders are expected to play an advisory role,<br>" +
                    "But you should humble yourself and open your doors to advisers as a head of state,<br>" +
                    "And accept criticism and dissenting views which can serve as advice,<br>" +
                    "Rather than viewing all those who refuse to sing your praises as enemies and detractors or disrespectful, disloyal and disobedient people<br>" +
                    "Are you genuinely interested in the advice of religious leaders?<br>" +
                    "Does it really make sense to you to expect advice from religious leaders or blame them for not advising you in the absence of affability and open door policy?  <br>" +
                    "Judging by the manner in which you dealt with religious leaders who opposed your views, do you think others will have the courage to advise you if you fail to change your attitude for the better?<br>" +
                    "Do you think religious leaders will deem it wise to advise a leader who is too full of himself and never heeds advice but misinterprets it and punishes advisers?<br>" +
                    "<br>" +
                    "You are to blame, Yahya<br>" +
                    "One of your newly-hired zombies requested our elders during your recent meeting with them to appeal to your compatriots in the Diaspora to desist from criticizing you and your government,<br>" +
                    "Alleging that they tarnish the image of their native country,<br>" +
                    "Arguing that they should say good things about their country of origin or simply keep quiet,<br>" +
                    "Despite the promulgation of draconian media laws meant to serve as a deterrent to criticism<br>" +
                    "Many people believe that you were the very one who assigned the over-zealous puppet to deliver that message,<br>" +
                    "For we all know that none of your ministers would dare to make utterances of that sort without your prior consent or approval<br>" +
                    "Why have you decided to appeal to your critics or negotiate with them to change their stance? <br>" +
                    "Why not continue to use force or harsh laws to silence them?<br>" +
                    "Have you now realized that you cannot muzzle your critics through force or draconian laws?<br>" +
                    "Don’t you think changing your stance is easier than trying to persuade or force your critics to change theirs?   <br>" +
                    "<br>" +
                    "You are to blame, Yahya<br>" +
                    "Stop blaming others unnecessarily and concentrate on your work<br>" +
                    "Fault finding and scapegoating cannot make you good in the eyes of people,<br>" +
                    "Nor can they exculpate or absolve you as you think<br>" +
                    "They only prove your ignorance, incapability and inefficiency<br>" +
                    "If you want to take credit for everything good at all times, you should be honest and man enough to accept responsibility when things go wrong<br>" +
                    "Are you always right?<br>" +
                    "Are those you blame always wrong?<br>" +
                    "If not, why take credit and blame others all the time? </font><br>" +
                    "<br>"
    };
};
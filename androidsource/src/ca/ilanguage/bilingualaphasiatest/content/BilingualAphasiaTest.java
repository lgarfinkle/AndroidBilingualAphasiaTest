package ca.ilanguage.bilingualaphasiatest.content;

import java.util.ArrayList;
import java.util.Locale;

import ca.ilanguage.oprime.content.Experiment;
import ca.ilanguage.oprime.content.Stimulus;
import ca.ilanguage.oprime.content.TwoImageStimulus;
import ca.ilanguage.oprime.content.SubExperimentBlock;
import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;
import ca.ilanguage.bilingualaphasiatest.R;

public class BilingualAphasiaTest extends Application {
	protected static final String TAG = "BilingualAphasiaTest";
	public static final boolean D = true;
	
	Experiment bat;
	Locale language;
	
	public ArrayList<SubExperimentBlock> subExperiments;
	int currentSubExperiment;
	
	String outputDir = "/sdcard/BilingualAphasiaTest/";
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		language = Locale.getDefault();
		forceLocale("iu");
		
		bat = new Experiment( getString(R.string.experiment_title) +" - "+ language.getDisplayLanguage() );
		subExperiments = new ArrayList<SubExperimentBlock>();
		String[] subextitles = getResources().getStringArray(R.array.subexperiment_titles);
		for(int i = 0; i < subextitles.length; i++){
			subExperiments.add(new SubExperimentBlock(subextitles[i]));
		}
		addStimuli();
		currentSubExperiment = 0;
		Log.d(TAG, "Oncreate of the application");
	}
	public ArrayList<String> getSubExperimentTitles() {
		ArrayList<String> titles = new ArrayList<String>();
		for( SubExperimentBlock subexperiment : subExperiments){
			titles.add(subexperiment.getTitle());
		}
		return titles;
	}	
	/**
	 * Forces the locale for the duration of the app to the language needed for that version of the Bilingual Aphasia Test
	 * @param lang
	 * @return
	 */
	public String forceLocale(String lang){
		if (lang.equals(Locale.getDefault().getLanguage())){
			return Locale.getDefault().getDisplayLanguage();
		}
		Configuration config = getBaseContext().getResources().getConfiguration();
		Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        language = Locale.getDefault();
		return Locale.getDefault().getDisplayLanguage();
    }
	
	public Locale getLanguage() {
		return language;
	}
	public void setLanguage(Locale language) {
		this.language = language;
	}
	public Experiment getExperiment() {
		return bat;
	}
	public void setExperiment(Experiment bat) {
		this.bat = bat;
	}
	public ArrayList<SubExperimentBlock> getSubExperiments() {
		return subExperiments;
	}	
	
	public void setSubExperiments(ArrayList<SubExperimentBlock> subExperiments) {
		this.subExperiments = subExperiments;
	}
	public int getCurrentSubExperiment() {
		return currentSubExperiment;
	}
	public void setCurrentSubExperiment(int currentSubExperiment) {
		this.currentSubExperiment = currentSubExperiment;
	}
	
	public String getOutputDir() {
		return outputDir;
	}
	public void setOutputDir(String outputDir) {
		this.outputDir = outputDir;
	}
	@Override
	public void onLowMemory() {
		// TODO Auto-generated method stub
		super.onLowMemory();
	}

	@Override
	public void onTerminate() {
		// TODO Auto-generated method stub
		super.onTerminate();
	}
	private void addStimuli(){
		
		ArrayList<TwoImageStimulus> stim = new ArrayList<TwoImageStimulus>();
		
//		stim.add(new Stimulus(R.drawable.s000));
//		stim.add(new Stimulus(R.drawable.s001));
//		stim.add(new Stimulus(R.drawable.s002));
		stim.add(new TwoImageStimulus(R.drawable.s003,R.drawable.s004));
		stim.add(new TwoImageStimulus(R.drawable.s005,R.drawable.s006));
		stim.add(new TwoImageStimulus(R.drawable.s007,R.drawable.s008));
		stim.add(new TwoImageStimulus(R.drawable.s009,R.drawable.s010));
		stim.add(new TwoImageStimulus(R.drawable.s011,R.drawable.s012));
		stim.add(new TwoImageStimulus(R.drawable.s013,R.drawable.s014));
		stim.add(new TwoImageStimulus(R.drawable.s015,R.drawable.s016));
		stim.add(new TwoImageStimulus(R.drawable.s017,R.drawable.s018));
		stim.add(new TwoImageStimulus(R.drawable.s019,R.drawable.s020));
		stim.add(new TwoImageStimulus(R.drawable.s021,R.drawable.s022));
		stim.add(new TwoImageStimulus(R.drawable.s023,R.drawable.s024));
		stim.add(new TwoImageStimulus(R.drawable.s025,R.drawable.s026));
		stim.add(new TwoImageStimulus(R.drawable.s027,R.drawable.s028));
		stim.add(new TwoImageStimulus(R.drawable.s029,R.drawable.s030));
		stim.add(new TwoImageStimulus(R.drawable.s031,R.drawable.s032));
		stim.add(new TwoImageStimulus(R.drawable.s033,R.drawable.s034));
		stim.add(new TwoImageStimulus(R.drawable.s035,R.drawable.s036));
		stim.add(new TwoImageStimulus(R.drawable.s037,R.drawable.s038));
		stim.add(new TwoImageStimulus(R.drawable.s039,R.drawable.s040));
		stim.add(new TwoImageStimulus(R.drawable.s041,R.drawable.androids_experimenter_kids));
		
		subExperiments.get(6).setStimuli(stim);
		
		stim = null;
		ArrayList<Stimulus> stimuli = new ArrayList<Stimulus>();
		
		stimuli.add(new Stimulus(R.drawable.s043));
		stimuli.add(new Stimulus(R.drawable.s044));
		stimuli.add(new Stimulus(R.drawable.s045));
		stimuli.add(new Stimulus(R.drawable.s046));
//		stimuli.add(new Stimulus(R.drawable.s047));
//		stimuli.add(new Stimulus(R.drawable.s048));
//		stimuli.add(new Stimulus(R.drawable.s049));
//		stimuli.add(new Stimulus(R.drawable.s050));
//		stimuli.add(new Stimulus(R.drawable.s051));
//		stimuli.add(new Stimulus(R.drawable.s052));
//		stimuli.add(new Stimulus(R.drawable.s053));
//		stimuli.add(new Stimulus(R.drawable.s054));
//		stimuli.add(new Stimulus(R.drawable.s055));
//		stimuli.add(new Stimulus(R.drawable.s056));
//		stimuli.add(new Stimulus(R.drawable.s057));
//		stimuli.add(new Stimulus(R.drawable.s058));
//		stimuli.add(new Stimulus(R.drawable.s059));
//		stimuli.add(new Stimulus(R.drawable.s060));
//		stimuli.add(new Stimulus(R.drawable.s061));
//		stimuli.add(new Stimulus(R.drawable.s062));
//		stimuli.add(new Stimulus(R.drawable.s063));
//		stimuli.add(new Stimulus(R.drawable.s064));
//		stimuli.add(new Stimulus(R.drawable.s065));
//		stimuli.add(new Stimulus(R.drawable.s066));
//		stimuli.add(new Stimulus(R.drawable.s067));
		stimuli.add(new Stimulus(R.drawable.s068));
		stimuli.add(new Stimulus(R.drawable.s069));
		stimuli.add(new Stimulus(R.drawable.s070));
		stimuli.add(new Stimulus(R.drawable.s071));
		stimuli.add(new Stimulus(R.drawable.s072));
//		stimuli.add(new Stimulus(R.drawable.s073));
		stimuli.add(new Stimulus(R.drawable.androids_experimenter_kids));

		subExperiments.get(7).setStimuli(stimuli);
		
		stimuli = null;
		stimuli = new ArrayList<Stimulus>();
		

		stimuli.add(new Stimulus(R.drawable.s074));
		
		subExperiments.get(21).setStimuli(stimuli);
		
		stimuli = null;
		stimuli = new ArrayList<Stimulus>();

		stimuli.add(new Stimulus(R.drawable.s075));
		stimuli.add(new Stimulus(R.drawable.s076));
		stimuli.add(new Stimulus(R.drawable.s077));
		stimuli.add(new Stimulus(R.drawable.s078));
		stimuli.add(new Stimulus(R.drawable.s079));
		stimuli.add(new Stimulus(R.drawable.s080));
		stimuli.add(new Stimulus(R.drawable.s081));
		stimuli.add(new Stimulus(R.drawable.s082));
		stimuli.add(new Stimulus(R.drawable.s083));
		stimuli.add(new Stimulus(R.drawable.s084));
		
		

		subExperiments.get(24).setStimuli(stimuli);
		
		stimuli = null;
		stimuli = new ArrayList<Stimulus>();
		
		stimuli.add(new Stimulus(R.drawable.s085));


		subExperiments.get(25).setStimuli(stimuli);
		
		stimuli = null;
		stimuli = new ArrayList<Stimulus>();
		
		stimuli.add(new Stimulus(R.drawable.s086));
		stimuli.add(new Stimulus(R.drawable.s087));
		stimuli.add(new Stimulus(R.drawable.s088));
		stimuli.add(new Stimulus(R.drawable.s089));
		stimuli.add(new Stimulus(R.drawable.s090));
		stimuli.add(new Stimulus(R.drawable.s091));
		stimuli.add(new Stimulus(R.drawable.s092));
		stimuli.add(new Stimulus(R.drawable.s093));
		stimuli.add(new Stimulus(R.drawable.s094));
		stimuli.add(new Stimulus(R.drawable.s095));
		stimuli.add(new Stimulus(R.drawable.s096));
		stimuli.add(new Stimulus(R.drawable.s097));
		stimuli.add(new Stimulus(R.drawable.s098));
		stimuli.add(new Stimulus(R.drawable.s099));
		stimuli.add(new Stimulus(R.drawable.s100));
		stimuli.add(new Stimulus(R.drawable.s101));
		stimuli.add(new Stimulus(R.drawable.s102));
		stimuli.add(new Stimulus(R.drawable.s103));
		stimuli.add(new Stimulus(R.drawable.s104));
		stimuli.add(new Stimulus(R.drawable.s105));
		stimuli.add(new Stimulus(R.drawable.s106));
		
		subExperiments.get(28).setStimuli(stimuli);
		
		stimuli = null;
		stimuli = new ArrayList<Stimulus>();
		
		stimuli.add(new Stimulus(R.drawable.s107));
		stimuli.add(new Stimulus(R.drawable.s108));
		stimuli.add(new Stimulus(R.drawable.s109));
		stimuli.add(new Stimulus(R.drawable.s110));
		stimuli.add(new Stimulus(R.drawable.s111));
		stimuli.add(new Stimulus(R.drawable.s112));
		stimuli.add(new Stimulus(R.drawable.s113));
		stimuli.add(new Stimulus(R.drawable.s114));
		stimuli.add(new Stimulus(R.drawable.s115));
		stimuli.add(new Stimulus(R.drawable.s116));
		stimuli.add(new Stimulus(R.drawable.s117));
		stimuli.add(new Stimulus(R.drawable.s118));
		stimuli.add(new Stimulus(R.drawable.s119));
		stimuli.add(new Stimulus(R.drawable.s120));
		stimuli.add(new Stimulus(R.drawable.s121));
		stimuli.add(new Stimulus(R.drawable.s122));
		stimuli.add(new Stimulus(R.drawable.s123));
		stimuli.add(new Stimulus(R.drawable.s124));
		stimuli.add(new Stimulus(R.drawable.s125));
		stimuli.add(new Stimulus(R.drawable.s126));
		stimuli.add(new Stimulus(R.drawable.s127));

		subExperiments.get(29).setStimuli(stimuli);
		
	}
	

}

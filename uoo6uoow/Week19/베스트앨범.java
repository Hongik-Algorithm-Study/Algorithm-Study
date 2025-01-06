import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 1. 장르별 총 재생 횟수 계산
        HashMap<String, Integer> genrePlayCount = new HashMap<>();
        HashMap<String, List<Song>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            // 총 재생 횟수 업데이트
            genrePlayCount.put(genre, genrePlayCount.getOrDefault(genre, 0) + play);

            // 장르별 곡 리스트 추가
            genreSongs.putIfAbsent(genre, new ArrayList<>());
            genreSongs.get(genre).add(new Song(i, play));
        }

        // 2. 장르별 재생 횟수를 기준으로 정렬
        List<String> sortedGenres = new ArrayList<>(genrePlayCount.keySet());
        sortedGenres.sort((g1, g2) -> genrePlayCount.get(g2) - genrePlayCount.get(g1));

        // 3. 장르별 곡 정렬 및 결과 수집
        List<Integer> bestAlbum = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<Song> songs = genreSongs.get(genre);

            // 곡 정렬: 재생 횟수 내림차순 -> 고유번호 오름차순
            songs.sort((s1, s2) -> s2.plays != s1.plays ? s2.plays - s1.plays : s1.id - s2.id);

            // 최대 2곡 추가
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                bestAlbum.add(songs.get(i).id);
            }
        }

        // 결과를 배열로 변환
        return bestAlbum.stream().mapToInt(Integer::intValue).toArray();
    }
}

// 곡 정보를 저장할 클래스
class Song {
    int id; // 고유번호
    int plays; // 재생 횟수

    public Song(int id, int plays) {
        this.id = id;
        this.plays = plays;
    }
}
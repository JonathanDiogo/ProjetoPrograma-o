package projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAO {
    public boolean existe(Users usuario) throws Exception{
        String sql="SELECT * FROM tb_usuario WHERE nome=? AND senha=?";
        try(Connection conn=ConexaoBD.obterConexao()){
                PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1,usuario.getNome());
                    ps.setString(2,usuario.getSenha());
                    try(ResultSet rs = ps.executeQuery()){
                        return rs.next();
                    }        
        }              
    }
    public ItensEstoques [] obterItens () throws Exception{ 
        String sql = "SELECT * FROM itens_estoque"; 
        try (Connection conn = ConexaoBD.obterConexao(); 
            PreparedStatement ps = 
            conn.prepareStatement(sql, 
                ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_READ_ONLY); 
            ResultSet rs = ps.executeQuery()){ 
            int totalDeItens = rs.last () ? rs.getRow() : 0; 
            ItensEstoques [] itens = new ItensEstoques[totalDeItens]; 
            rs.beforeFirst(); 
            int contador = 0; 
            while (rs.next()){ 
                int id = rs.getInt("id"); 
                String nome = rs.getString("nome"); 
                String valor = rs.getString ("valor"); 
                itens[contador++] = new ItensEstoques (id, nome, valor); 
            } 
            return itens; 
        } 
    }
    
    public void inserirItens (ItensEstoques itens) throws Exception{ 
        String sql = "INSERT INTO itens_estoque (nome, valor) VALUES (?, ?);"; 
        try (Connection conexao = ConexaoBD.obterConexao(); 
                PreparedStatement ps = conexao.prepareStatement(sql)){ 
            ps.setString(1, itens.getNome()); 
            ps.setString(2, itens.getValor()); 
            ps.execute(); 
        } 
    } 
    public void atualizariTens (ItensEstoques itens) throws Exception{ 
        String sql = "UPDATE itens_estoque SET nome = ?, valor = ? WHERE id = ?"; 
        try (Connection conexao = ConexaoBD.obterConexao(); 
                PreparedStatement ps = conexao.prepareStatement(sql)){ 
            ps.setString (1, itens.getNome()); 
            ps.setString (2, itens.getValor()); 
            ps.setInt (3, itens.getId()); 
            ps.execute(); 
        } 
    }    
    public void removerItens (ItensEstoques itens) throws Exception{ 
        String sql = "DELETE FROM itens_estoque WHERE id = ?"; 
        try (Connection conexao = ConexaoBD.obterConexao(); 
                PreparedStatement ps = conexao.prepareStatement(sql);){ 
            ps.setInt (1, itens.getId()); 
            ps.execute(); 
        } 
    }


    public List<Itens> buscaAlunosPorCurso(ItensEstoques curso) throws Exception{ 
        String sql = "SELECT ra, nome, ano_nascimento FROM tb_aluno INNER " 
       + "JOIN tb_aluno_curso ON tb_aluno.ra = tb_aluno_curso.ra_aluno WHERE id_curso" 
       + "= ?"; 
        List <Itens> alunos = new ArrayList<> (); 
        try (Connection conexao = ConexaoBD.obterConexao(); 
                PreparedStatement ps = conexao.prepareStatement(sql)){ 
            ps.setInt (1, curso.getId()); 
            try (ResultSet rs = ps.executeQuery()){ 
                while (rs.next()){ 
                    int ra = rs.getInt("ra"); 
                    String nome = rs.getString ("nome"); 
                    int anoNascimento = rs.getInt ("ano_nascimento"); 
                    alunos.add(new Itens (ra, nome, anoNascimento)); 
                } 
            } 
        }   
        return alunos; 
    }     
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.av1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Produto {
    
    
    public static ArrayList listaProdutos = new ArrayList();
    private String descricao;
    private String nomeReduzido;
    private String unidade;
    private String apresentacao;
    private double comissao;
    private String codigoBarras;
    // 0 Serviço - 1 Produto
    private int tipoProduto;
    // 0 Qnt - 1 Valor
    private int vendaProduto;
    private int estoqueOnline;
    private int descontConvenio;
    private boolean promocao;
    private double valorPromocao;
    private double valorCompra;
    private double custoOperacional;
    private double margemLucro;
    private double valoraVista;
    private double valorDesconto;
    private double estoqMin;
    private double estoqMax;
    private String ultimoAumento;
    private String validadePromocao;

    public Produto() {
    }

    public Produto(String descricao, String nomeReduzido, String unidade, String apresentacao, double comissao, String codigoBarras, int tipoProduto, int vendaProduto, int estoqueOnline, int descontConvenio, boolean promocao, double valorPromocao, double valorCompra, double custoOperacional, double margemLucro, double valoraVista, double valorDesconto, double estoqMin, double estoqMax, String ultimoAumento, String validadePromocao) {
        this.descricao = descricao;
        this.nomeReduzido = nomeReduzido;
        this.unidade = unidade;
        this.apresentacao = apresentacao;
        this.comissao = comissao;
        this.codigoBarras = codigoBarras;
        this.tipoProduto = tipoProduto;
        this.vendaProduto = vendaProduto;
        this.estoqueOnline = estoqueOnline;
        this.descontConvenio = descontConvenio;
        this.promocao = promocao;
        this.valorPromocao = valorPromocao;
        this.valorCompra = valorCompra;
        this.custoOperacional = custoOperacional;
        this.margemLucro = margemLucro;
        this.valoraVista = valoraVista;
        this.valorDesconto = valorDesconto;
        this.estoqMin = estoqMin;
        this.estoqMax = estoqMax;
        this.ultimoAumento = ultimoAumento;
        this.validadePromocao = validadePromocao;
    }

    public static ArrayList getListaProdutos() {
        return listaProdutos;
    }

    public static void setListaProdutos(ArrayList listaProdutos) {
        Produto.listaProdutos = listaProdutos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeReduzido() {
        return nomeReduzido;
    }

    public void setNomeReduzido(String nomeReduzido) {
        this.nomeReduzido = nomeReduzido;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(int tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public int getVendaProduto() {
        return vendaProduto;
    }

    public void setVendaProduto(int vendaProduto) {
        this.vendaProduto = vendaProduto;
    }

    public int getEstoqueOnline() {
        return estoqueOnline;
    }

    public void setEstoqueOnline(int estoqueOnline) {
        this.estoqueOnline = estoqueOnline;
    }

    public int getDescontConvenio() {
        return descontConvenio;
    }

    public void setDescontConvenio(int descontConvenio) {
        this.descontConvenio = descontConvenio;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    public double getValorPromocao() {
        return valorPromocao;
    }

    public void setValorPromocao(double valorPromocao) {
        this.valorPromocao = valorPromocao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getCustoOperacional() {
        return custoOperacional;
    }

    public void setCustoOperacional(double custoOperacional) {
        this.custoOperacional = custoOperacional;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double getValoraVista() {
        return valoraVista;
    }

    public void setValoraVista(double valoraVista) {
        this.valoraVista = valoraVista;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getEstoqMin() {
        return estoqMin;
    }

    public void setEstoqMin(double estoqMin) {
        this.estoqMin = estoqMin;
    }

    public double getEstoqMax() {
        return estoqMax;
    }

    public void setEstoqMax(double estoqMax) {
        this.estoqMax = estoqMax;
    }

    public String getUltimoAumento() {
        return ultimoAumento;
    }

    public void setUltimoAumento(String ultimoAumento) {
        this.ultimoAumento = ultimoAumento;
    }

    public String getValidadePromocao() {
        return validadePromocao;
    }

    public void setValidadePromocao(String validadePromocao) {
        this.validadePromocao = validadePromocao;
    }
    
    public void InserirProduto (Produto pProdutoInserido){
        try {
            Produto.listaProdutos.add(pProdutoInserido);
            //Todo - fazer metodo limpar a tela
            //TODO - verificar se produto ja n tem cadastro
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());  
        }
    }
    
    public Produto PesquisarProduto(String pNomeProduto){
        Produto pAux = new Produto();
        if(this.listaProdutos != null)
        {
            for (int i = 0; i < listaProdutos.size(); i++)
            {
                pAux = (Produto)listaProdutos.get(i);
                if(pAux.getNomeReduzido().equals(pNomeProduto))
                {
                    return pAux;
                }
            }
        }
        return pAux;
    }
    
    public void RemoverProduto(String pNomeProduto){
        try {
            Produto pAux = new Produto();
            if(this.listaProdutos != null)
            {
                for (int i = 0; i < listaProdutos.size(); i++){
                    pAux = (Produto) listaProdutos.get(i);
                    if(pAux.getNomeReduzido().equals(pNomeProduto))
                    {
                        this.listaProdutos.remove(i);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao remover seu Produto");
        }
    
    }
    
    public void AlterarProduto(Produto pProdutoAlterado)
    {
        this.setApresentacao(pProdutoAlterado.getApresentacao());
        this.setDescricao(pProdutoAlterado.getDescricao());
        this.setNomeReduzido(pProdutoAlterado.getNomeReduzido());
        this.setUnidade(pProdutoAlterado.getUnidade());
        this.setComissao(pProdutoAlterado.getComissao());
        this.setCodigoBarras(pProdutoAlterado.getCodigoBarras());
        this.setTipoProduto(pProdutoAlterado.getTipoProduto());
        this.setVendaProduto(pProdutoAlterado.getVendaProduto());
        this.setDescontConvenio(pProdutoAlterado.getDescontConvenio());
        this.setValorPromocao(pProdutoAlterado.getValorPromocao());
        this.setValorCompra (pProdutoAlterado.getValorCompra());
        this.setCustoOperacional(pProdutoAlterado.getCustoOperacional());
        this.setMargemLucro (pProdutoAlterado.getMargemLucro());
        this.setValoraVista (pProdutoAlterado.getValoraVista());
        this.setValorDesconto (pProdutoAlterado.getValorDesconto());
        this.setEstoqMin (pProdutoAlterado.getEstoqMin());
        this.setEstoqMax(pProdutoAlterado.getEstoqMax());
        this.setUltimoAumento(pProdutoAlterado.getUltimoAumento());
        this.setValidadePromocao(pProdutoAlterado.getValidadePromocao());
    }
}

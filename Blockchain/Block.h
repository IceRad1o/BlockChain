//
// Created by Jialei Wang on 2020/1/17.
//

#ifndef BLOCKCHAIN_BLOCKCHAIN_H
#define BLOCKCHAIN_BLOCKCHAIN_H

#include <string>

class Block{
public:
    std::string sPrevHash;
    Block(uint32_t nIndexIn, const std::string &sDataIn);

    std::string GetHash();

    void MineBlock(uint32_t nDifficulty);
private:
    uint32_t _nIndex;
    int64_t _nNonce;
    std::string _sData;
    std::string _sHash;
    time_t _tTime;

    std::string _CalculateHash() const;
};

Block::Block(uint32_t nIndexIn, const std::string &sDataIn) {

}

std::string Block::GetHash() {
    return std::string();
}

void Block::MineBlock(uint32_t nDifficulty) {

}

#endif //BLOCKCHAIN_BLOCKCHAIN_H

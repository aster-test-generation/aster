# Automatically generated by Pynguin.
import ansible.module_utils.facts.system.distribution as module_0

def test_case_0():
    pass

def test_case_1():
    bool_0 = False
    distribution_files_0 = module_0.DistributionFiles(bool_0)
    var_0 = distribution_files_0.process_dist_files()

def test_case_2():
    distribution_fact_collector_0 = module_0.DistributionFactCollector()
    list_0 = [distribution_fact_collector_0]
    distribution_files_0 = module_0.DistributionFiles(list_0)
    str_0 = 'httpapi_plugins'
    bool_0 = False
    var_0 = distribution_files_0.parse_distribution_file_Slackware(list_0, str_0, distribution_fact_collector_0, bool_0)

def test_case_3():
    distribution_fact_collector_0 = module_0.DistributionFactCollector()
    str_0 = 'library'
    distribution_0 = module_0.Distribution(str_0)
    str_1 = '8XBJ>'
    tuple_0 = None
    str_2 = None
    list_0 = []
    distribution_1 = module_0.Distribution(distribution_fact_collector_0)
    distribution_2 = module_0.Distribution(distribution_1)
    tuple_1 = (list_0, str_0, distribution_2)
    distribution_files_0 = module_0.DistributionFiles(tuple_1)
    distribution_files_1 = module_0.DistributionFiles(distribution_files_0)
    var_0 = distribution_files_1.parse_distribution_file_NA(distribution_0, str_1, tuple_0, str_2)
    distribution_files_2 = module_0.DistributionFiles(distribution_files_0)
    bool_0 = False
    var_1 = distribution_files_2.parse_distribution_file_OpenWrt(bool_0, tuple_1, list_0, str_1)

def test_case_4():
    var_0 = None
    distribution_files_0 = module_0.DistributionFiles(var_0)
    str_0 = 'IsKql@_}EUH:{!4_r-7'
    str_1 = 'OpenWrt'
    var_1 = distribution_files_0.parse_distribution_file_OpenWrt(str_0, str_1, str_0, str_0)

def test_case_5():
    bool_0 = None
    list_0 = [bool_0, bool_0, bool_0]
    str_0 = "F>V[39$*')\x0cWS9N%OzB"
    bytes_0 = b'\xc2.t\x90\x87\xcb\x94\xea'
    distribution_fact_collector_0 = module_0.DistributionFactCollector()
    distribution_0 = module_0.Distribution(distribution_fact_collector_0)
    dict_0 = {distribution_0: distribution_0, distribution_0: distribution_fact_collector_0, distribution_0: distribution_0, distribution_fact_collector_0: distribution_0}
    distribution_fact_collector_1 = module_0.DistributionFactCollector(distribution_0, dict_0)
    distribution_files_0 = module_0.DistributionFiles(distribution_fact_collector_1)
    var_0 = distribution_files_0.parse_distribution_file_Alpine(bool_0, list_0, str_0, bytes_0)

def test_case_6():
    str_0 = '*-i3uBv]0=\x0chDU$$0UI4'
    float_0 = 2940.0
    bytes_0 = b"\xd9\x85\x8a'T\xbe\xd4>\x85\x8e*\xc2\x10\x17\xfdC"
    list_0 = [str_0, float_0, bytes_0, float_0]
    distribution_files_0 = module_0.DistributionFiles(str_0)
    var_0 = distribution_files_0.parse_distribution_file_SUSE(str_0, str_0, float_0, list_0)

def test_case_7():
    str_0 = '*-i3uBv]0=\x0chDU$$0UI4'
    distribution_files_0 = module_0.DistributionFiles(str_0)
    bool_0 = True
    float_0 = 1009.01788
    var_0 = distribution_files_0.parse_distribution_file_Debian(bool_0, str_0, distribution_files_0, float_0)

def test_case_8():
    bool_0 = None
    str_0 = 'Linux'
    set_0 = None
    dict_0 = {bool_0: str_0, set_0: str_0, set_0: bool_0}
    str_1 = '$MG`v|$\x0cjL[s'
    distribution_files_0 = module_0.DistributionFiles(str_1)
    var_0 = distribution_files_0.parse_distribution_file_Mandriva(bool_0, str_0, dict_0, set_0)

def test_case_9():
    str_0 = '9]WpPI:"mVQ?oe(n\rGB'
    distribution_files_0 = module_0.DistributionFiles(str_0)
    bytes_0 = b'e pJ\xaf \xfaJ\xa5&\x1b^\xdd\x02F'
    str_1 = '/usr/bin/emerge'
    var_0 = distribution_files_0.parse_distribution_file_NA(bytes_0, str_1, bytes_0, distribution_files_0)

def test_case_10():
    str_0 = 'redhat'
    distribution_fact_collector_0 = module_0.DistributionFactCollector(str_0)
    list_0 = [str_0]
    distribution_files_0 = module_0.DistributionFiles(distribution_fact_collector_0)
    var_0 = distribution_files_0.parse_distribution_file_Coreos(list_0, list_0, str_0, list_0)
    distribution_fact_collector_1 = module_0.DistributionFactCollector(distribution_fact_collector_0)

def test_case_11():
    str_0 = 'NAME=Flatcar Linux\nID=flatcar\nVERSION=2842.5.1\nVERSION_ID=2842.5.1\nPRETTY_NAME="Flatcar Linux (2842.5.1)"\nANSI_COLOR="1;34"\nHOME_URL="https://www.flatcar-linux.org/"\nSUPPORT_URL="https://www.flatcar-linux.org/"\nBUG_REPORT_URL="https://www.flatcar-linux.org/'
    distribution_files_0 = module_0.DistributionFiles(str_0)
    var_0 = distribution_files_0.parse_distribution_file_Flatcar(str_0, str_0, str_0, distribution_files_0)

def test_case_12():
    str_0 = "0v\r\t0'Jr~l2Au"
    float_0 = 2025.621
    bool_0 = True
    distribution_fact_collector_0 = module_0.DistributionFactCollector(str_0)
    distribution_files_0 = module_0.DistributionFiles(distribution_fact_collector_0)
    var_0 = distribution_files_0.parse_distribution_file_ClearLinux(str_0, float_0, bool_0, distribution_files_0)

def test_case_13():
    int_0 = 0
    int_1 = 2427
    distribution_fact_collector_0 = module_0.DistributionFactCollector(int_1)
    str_0 = '(c-ee<\\%4\t0]-T-\r\r(p)'
    distribution_0 = module_0.Distribution(str_0)
    list_0 = [int_0, int_0, int_0, int_0]
    distribution_files_0 = module_0.DistributionFiles(list_0)
    distribution_files_1 = module_0.DistributionFiles(distribution_files_0)
    var_0 = distribution_files_1.parse_distribution_file_CentOS(distribution_fact_collector_0, str_0, distribution_0, distribution_fact_collector_0)

def test_case_14():
    str_0 = '>K+1'
    distribution_0 = module_0.Distribution(str_0)
    var_0 = distribution_0.get_distribution_facts()

def test_case_15():
    float_0 = 2586.79
    distribution_0 = module_0.Distribution(float_0)
    var_0 = distribution_0.get_distribution_FreeBSD()

def test_case_16():
    distribution_fact_collector_0 = module_0.DistributionFactCollector()
    var_0 = distribution_fact_collector_0.collect()

def test_case_17():
    float_0 = 100.0
    complex_0 = None
    distribution_fact_collector_0 = module_0.DistributionFactCollector()
    list_0 = [float_0, distribution_fact_collector_0, float_0, float_0]
    distribution_files_0 = module_0.DistributionFiles(list_0)
    dict_0 = {complex_0: complex_0, complex_0: distribution_fact_collector_0, complex_0: float_0, float_0: distribution_files_0}
    var_0 = distribution_fact_collector_0.collect(dict_0)
    var_1 = distribution_fact_collector_0.collect(float_0, complex_0)

def test_case_18():
    str_0 = ''
    tuple_0 = (str_0,)
    distribution_0 = module_0.Distribution(tuple_0)
    str_1 = 'ABiJX'
    str_2 = 'j>~\x0bJ0y2'
    bool_0 = False
    distribution_files_0 = module_0.DistributionFiles(bool_0)
    var_0 = distribution_files_0.parse_distribution_file_Amazon(distribution_0, str_1, str_1, str_2)
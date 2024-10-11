import os
import re
import subprocess
import csv
from collections import defaultdict
import shutil

def setup_venv(project_root):
    venv_path = os.path.abspath(os.path.join(project_root, 'venv'))
    venv_pip = os.path.abspath(os.path.join(venv_path, 'bin', 'pip'))

    if not os.path.exists(venv_path):
        print(f"Creating virtual environment in {venv_path}")
        try:
            subprocess.run(["python3", "-m", "venv", venv_path], check=True)
        except subprocess.CalledProcessError as e:
            print(f"Error creating virtual environment: {e}")
            return None
    # Always install pytest, coverage, and mutmut
    print("Installing pytest, pytest-cov, and mutmut...")
    try:
        subprocess.run([venv_pip, "install", "pytest", "pytest-cov", "mutmut"], check=True)
    except subprocess.CalledProcessError as e:
        print(f"Error installing dependencies: {e}")
    return venv_path

def run_mutation_testing(project_root, module, test_base_dir):
    test_dir = os.path.abspath(os.path.join(test_base_dir, module + 'gen'))
    module_path = os.path.join(project_root, module.replace('.', '/') + '.py')

    # Move existing test and tests directories if they exist
    original_test_dir = os.path.join(project_root, 'test')
    original_tests_dir = os.path.join(project_root, 'tests')

    if os.path.exists(original_test_dir):
        shutil.rmtree(original_test_dir)
    if os.path.exists(original_tests_dir):
        shutil.rmtree(original_tests_dir)

    shutil.copytree(test_dir, os.path.join(project_root, 'test'))

    try:
        command = f"cd {project_root} && source venv/bin/activate && PYTHONPATH={project_root} mutmut run --paths-to-mutate={module_path}"
        print(command)
        result = subprocess.run(command, shell=True, capture_output=True, text=True, timeout=600)
        return result.stdout, result.stderr, result.returncode
    except subprocess.TimeoutExpired:
        return None, "Timeout: Mutation testing took too long to execute", 1
    except Exception as e:
        return None, f"Error: {str(e)}", 1

def install_dependencies(project_root, venv_path):
    if venv_path:
        print("Virtual environment is already created. Skipping dependency installation.")
        return

    venv_pip = os.path.abspath(os.path.join(venv_path, 'bin', 'pip'))
    venv_python = os.path.abspath(os.path.join(venv_path, 'bin', 'python'))

    settings_map = {
        "requirements.txt": ["pip", "install", "-r", "requirements.txt"],
        "package.txt": ["pip", "install", "-r", "package.txt"],
        "Pipfile": ["pipenv", "install"],
        "pyproject.toml": ["poetry", "install"],
        "environment.yml": ["conda", "env", "create", "-f", "environment.yml"],
        "setup.py": ["pip", "install", "."]
    }

    dependency_installed = False

    for setting_file, command in settings_map.items():
        setting_file_path = os.path.abspath(os.path.join(project_root, setting_file))
        if os.path.exists(setting_file_path):
            print(f"Found {setting_file}, installing dependencies...")
            try:
                if setting_file == "requirements.txt":
                    subprocess.run([venv_pip, "install", "-r", setting_file_path], check=True)
                elif setting_file == "package.txt":
                    subprocess.run([venv_pip, "install", "-r", setting_file_path], check=True)
                elif setting_file == "Pipfile":
                    subprocess.run([venv_pip, "install", "pipenv"], check=True)
                    subprocess.run(["pipenv", "install", "--system", "--skip-lock"], cwd=project_root, check=True)
                elif setting_file == "pyproject.toml":
                    subprocess.run([venv_pip, "install", "poetry"], check=True)
                    subprocess.run(["poetry", "config", "virtualenvs.create", "false"], cwd=project_root, check=True)
                    subprocess.run(["poetry", "install"], cwd=project_root, check=True)
                elif setting_file == "environment.yml":
                    if shutil.which("conda"):
                        subprocess.run(
                            ["conda", "env", "update", "-f", setting_file_path, "--name", "base"],
                            check=True)
                    else:
                        print("Conda not found. Skipping environment.yml.")
                elif setting_file == "setup.py":
                    subprocess.run([venv_python, "setup.py", "install"], cwd=project_root, check=True)

                dependency_installed = True
                break
            except subprocess.CalledProcessError as e:
                print(f"Error installing dependencies: {e}")

    if not dependency_installed:
        print("No recognized dependency file found. Skipping dependency installation.")

def extract_mutation_score(mutation_output):
    if mutation_output is None:
        return 0.0
    # Find the last line with mutation results
    lines = mutation_output.split('\n')
    last_result_line = ''
    for line in reversed(lines):
        if re.search(r'\d+/\d+', line):
            last_result_line = line
            break

    if not last_result_line:
        return 0.0  # Return 0 if no valid line is found

    # Extract the numbers
    matches = re.findall(r'🎉 (\d+).*🙁 (\d+)', last_result_line)
    if not matches:
        return 0.0  # Return 0 if the pattern is not found

    killed, survived = map(int, matches[0])
    total = killed + survived

    # Calculate the percentage
    if total == 0:
        return 0.0  # Avoid division by zero

    mutation_percentage = (killed / total) * 100
    return round(mutation_percentage, 2)

def write_summary_to_csv(results):
    with open('res.csv', 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)
        writer.writerow(['project_root', 'mutation score'])
        for row in results:
            writer.writerow(row)

def main():
    input_file = '/home/myeongsoo/codamosa_module.csv'
    test_base_dir = '/home/myeongsoo/aster-py-exp/codamosa_result5/'

    projects = defaultdict(list)
    results = []

    with open(input_file, 'r') as f:
        reader = csv.reader(f)
        for row in reader:
            project_root, module_name = row
            projects[os.path.abspath(project_root)].append(module_name)

    for project_root, modules in projects.items():
        print(f"Project: {project_root}")
        project_mutation_score = 0.0

        venv_path = setup_venv(project_root)
        install_dependencies(project_root, venv_path)

        for module in modules:
            module_rel_path = module.replace('.', '/') + '.py'
            module_file = os.path.abspath(os.path.join(project_root, module_rel_path))

            print(f"  Module: {module}")

            # Run mutation testing
            mutation_stdout, mutation_stderr, mutation_returncode = run_mutation_testing(project_root, module, test_base_dir)
            mutation_score = extract_mutation_score(mutation_stdout)

            print(f"    Mutation score: {mutation_score:.2f}%")

            if mutation_returncode != 0:
                print(f"    Note: Mutation testing had non-zero return code ({mutation_returncode})")
                print(f"    Error details: {mutation_stderr}")

            project_mutation_score += mutation_score

        print(f"Project Summary:")
        average_mutation_score = project_mutation_score / len(modules) if modules else 0

        print(f"  Average mutation score: {average_mutation_score:.2f}%")
        print("=" * 50)

        results.append([
            project_root,
            f"{average_mutation_score:.2f}%"
        ])

    write_summary_to_csv(results)
    print("Results have been written to res.csv")

if __name__ == "__main__":
    main()
